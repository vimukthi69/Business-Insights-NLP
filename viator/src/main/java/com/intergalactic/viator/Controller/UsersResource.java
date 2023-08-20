package com.intergalactic.viator.Controller;

import com.intergalactic.viator.Model.TravelModes;
import com.intergalactic.viator.Model.Users;
import com.intergalactic.viator.Service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/Users" )
public class UsersResource {
    private final UsersService usersService;

    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping( "/all" )
    public ResponseEntity<List<Users>> getAllUsers()
    {
        List<Users> users = usersService.findAllUsers();
        return new ResponseEntity<>( users, HttpStatus.OK );
    }

    @PostMapping( "/add" )
    public ResponseEntity<Users> addUsers( @RequestBody Users users )
    {
        Users newUsers = usersService.addUsers( users );
        return new ResponseEntity<>( newUsers, HttpStatus.CREATED );
    }
}
