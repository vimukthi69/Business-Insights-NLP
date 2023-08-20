package com.intergalactic.viator.Service;

import com.intergalactic.viator.Model.PlanetDestinations;
import com.intergalactic.viator.Model.Planets;
import com.intergalactic.viator.Repository.PlanetsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetsService {
    private final PlanetsRepository planetsRepository;

    public PlanetsService(PlanetsRepository planetsRepository) {
        this.planetsRepository = planetsRepository;
    }

    public Planets addPlanets(Planets planets) {
        return planetsRepository.save(planets);
    }

    public List<Planets> findAllPlanets() {
        return planetsRepository.findAll();
    }
}
