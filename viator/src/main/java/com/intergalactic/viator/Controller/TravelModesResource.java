package com.intergalactic.viator.Controller;

import com.intergalactic.viator.Model.Planets;
import com.intergalactic.viator.Model.TravelModes;
import com.intergalactic.viator.Service.TravelModesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/TravelModes" )
public class TravelModesResource {
    private final TravelModesService travelModesService;

    public TravelModesResource(TravelModesService travelModesService) {
        this.travelModesService = travelModesService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<TravelModes>> getAllTravelModes()
    {
        List<TravelModes> travelModes = travelModesService.findAllTravelModes();
        return new ResponseEntity<>( travelModes, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<TravelModes> addTravelModes( @RequestBody TravelModes travelModes )
    {
        TravelModes newTravelModes = travelModesService.addTravelModes( travelModes );
        return new ResponseEntity<>( newTravelModes, HttpStatus.CREATED );
    }
}
