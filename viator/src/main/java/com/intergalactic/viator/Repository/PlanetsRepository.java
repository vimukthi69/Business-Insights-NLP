package com.intergalactic.viator.Repository;

import com.intergalactic.viator.Model.Planets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetsRepository extends JpaRepository<Planets, Integer> {
}
