package com.intergalactic.viator.Controller;

import com.intergalactic.viator.Model.UserTravelDetails;
import com.intergalactic.viator.Model.UserTrips;
import com.intergalactic.viator.Service.UserTripsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/UserTrips" )
public class UserTripsResource {
    private final UserTripsService userTripsService;

    public UserTripsResource(UserTripsService userTripsService) {
        this.userTripsService = userTripsService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<UserTrips>> getAllUserTrips()
    {
        List<UserTrips> userTrips = userTripsService.findAllUserTrips();
        return new ResponseEntity<>( userTrips, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<UserTrips> addUserTrips( @RequestBody UserTrips userTrips )
    {
        UserTrips newUserTrips = userTripsService.addUserTrips( userTrips );
        return new ResponseEntity<>( newUserTrips, HttpStatus.CREATED );
    }
}
