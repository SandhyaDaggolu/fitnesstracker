package com.Vcube.fitnesstracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Vcube.fitnesstracker.model.Workout;

@Repository
public interface WorkoutRepo extends JpaRepository<Workout, Integer>{

}
