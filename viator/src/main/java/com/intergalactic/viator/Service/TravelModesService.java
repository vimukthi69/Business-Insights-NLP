package com.intergalactic.viator.Service;

import com.intergalactic.viator.Model.Planets;
import com.intergalactic.viator.Model.TravelModes;
import com.intergalactic.viator.Repository.TravelModesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelModesService {
    private final TravelModesRepository travelModesRepository;

    public TravelModesService(TravelModesRepository travelModesRepository) {
        this.travelModesRepository = travelModesRepository;
    }

    public TravelModes addTravelModes(TravelModes travelModes) {
        return travelModesRepository.save(travelModes);
    }

    public List<TravelModes> findAllTravelModes() {
        return travelModesRepository.findAll();
    }
}
