package com.intergalactic.viator.Service;

import com.intergalactic.viator.Model.UserTravelDetails;
import com.intergalactic.viator.Model.UserTrips;
import com.intergalactic.viator.Repository.UserTripsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTripsService {
    private final UserTripsRepository userTripsRepository;

    public UserTripsService(UserTripsRepository userTripsRepository) {
        this.userTripsRepository = userTripsRepository;
    }

    public UserTrips addUserTrips(UserTrips userTrips) {
        return userTripsRepository.save(userTrips);
    }

    public List<UserTrips> findAllUserTrips() {
        return userTripsRepository.findAll();
    }
}
