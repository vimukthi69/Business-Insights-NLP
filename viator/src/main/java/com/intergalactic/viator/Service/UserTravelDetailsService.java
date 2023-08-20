package com.intergalactic.viator.Service;

import com.intergalactic.viator.Model.UserTravelDetails;
import com.intergalactic.viator.Model.Users;
import com.intergalactic.viator.Repository.UserTravelDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTravelDetailsService {
    private final UserTravelDetailsRepository userTravelDetailsRepository;

    public UserTravelDetailsService(UserTravelDetailsRepository userTravelDetailsRepository) {
        this.userTravelDetailsRepository = userTravelDetailsRepository;
    }

    public UserTravelDetails addUserTravelDetails(UserTravelDetails userTravelDetails) {
        return userTravelDetailsRepository.save(userTravelDetails);
    }

    public List<UserTravelDetails> findAllUserTravelDetails() {
        return userTravelDetailsRepository.findAll();
    }
}
