package com.intergalactic.viator.Controller;

import com.intergalactic.viator.Model.PlanetDestinations;
import com.intergalactic.viator.Model.Planets;
import com.intergalactic.viator.Service.PlanetsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/Planets" )
public class PlanetsResource {
    private final PlanetsService planetsService;

    public PlanetsResource(PlanetsService planetsService) {
        this.planetsService = planetsService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<Planets>> getAllPlanets()
    {
        List<Planets> planets = planetsService.findAllPlanets();
        return new ResponseEntity<>( planets, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<Planets> addPlanets( @RequestBody Planets planets )
    {
        Planets newPlanets = planetsService.addPlanets( planets );
        return new ResponseEntity<>( newPlanets, HttpStatus.CREATED );
    }
}
