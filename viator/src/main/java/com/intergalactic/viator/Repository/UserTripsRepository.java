package com.intergalactic.viator.Repository;

import com.intergalactic.viator.Model.UserTravelDetails;
import com.intergalactic.viator.Model.UserTrips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTripsRepository extends JpaRepository<UserTrips, Integer> {
}
