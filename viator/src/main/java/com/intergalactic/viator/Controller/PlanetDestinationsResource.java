package com.intergalactic.viator.Controller;

import com.intergalactic.viator.Model.PlanetDestinations;
import com.intergalactic.viator.Service.PlanetDestinationsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/PlanetDestinations" )
public class PlanetDestinationsResource {
    private final PlanetDestinationsService planetDestinationsService;

    public PlanetDestinationsResource(PlanetDestinationsService planetDestinationsService) {
        this.planetDestinationsService = planetDestinationsService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<PlanetDestinations>> getAllPlanetDestinations()
    {
        List<PlanetDestinations> planetDestinations = planetDestinationsService.findAllPlanetDestinations();
        return new ResponseEntity<>( planetDestinations, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<PlanetDestinations> addPlanetDestination( @RequestBody PlanetDestinations planetDestinations )
    {
        PlanetDestinations newPlanetDestination = planetDestinationsService.addPlanetDestinations( planetDestinations );
        return new ResponseEntity<>( newPlanetDestination, HttpStatus.CREATED );
    }
}
