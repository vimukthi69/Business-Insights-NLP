package com.intergalactic.viator.Repository;

import com.intergalactic.viator.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
