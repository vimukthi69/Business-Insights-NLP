package com.intergalactic.viator.Controller;

import com.intergalactic.viator.Model.UserTravelDetails;
import com.intergalactic.viator.Model.Users;
import com.intergalactic.viator.Service.UserTravelDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/UserTravelDetails" )
public class UserTravelDetailsResource {
    private final UserTravelDetailsService userTravelDetailsService;

    public UserTravelDetailsResource(UserTravelDetailsService userTravelDetailsService) {
        this.userTravelDetailsService = userTravelDetailsService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<UserTravelDetails>> getAllUserTravelDetails()
    {
        List<UserTravelDetails> userTravelDetails = userTravelDetailsService.findAllUserTravelDetails();
        return new ResponseEntity<>( userTravelDetails, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<UserTravelDetails> addUserTravelDetails( @RequestBody UserTravelDetails userTravelDetails )
    {
        UserTravelDetails newUserTravelDetails = userTravelDetailsService.addUserTravelDetails( userTravelDetails );
        return new ResponseEntity<>( newUserTravelDetails, HttpStatus.CREATED );
    }
}
