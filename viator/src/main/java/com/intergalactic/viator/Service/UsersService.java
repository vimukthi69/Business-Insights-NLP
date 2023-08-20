package com.intergalactic.viator.Service;

import com.intergalactic.viator.Model.TravelModes;
import com.intergalactic.viator.Model.Users;
import com.intergalactic.viator.Repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users addUsers(Users users) {
        return usersRepository.save(users);
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }
}
