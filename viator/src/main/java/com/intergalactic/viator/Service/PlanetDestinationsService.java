package com.intergalactic.viator.Service;

import com.intergalactic.viator.Model.PlanetDestinations;
import com.intergalactic.viator.Repository.PlanetDestinationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetDestinationsService {
    private final PlanetDestinationsRepository planetDestinationsRepository;

    public PlanetDestinationsService(PlanetDestinationsRepository planetDestinationsRepository) {
        this.planetDestinationsRepository = planetDestinationsRepository;
    }

    public PlanetDestinations addPlanetDestinations(PlanetDestinations planetDestinations) {
        return planetDestinationsRepository.save(planetDestinations);
    }

    public List<PlanetDestinations> findAllPlanetDestinations() {
        return planetDestinationsRepository.findAll();
    }
}
