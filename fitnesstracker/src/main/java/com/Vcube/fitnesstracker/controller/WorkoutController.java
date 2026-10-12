package com.Vcube.fitnesstracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vcube.fitnesstracker.model.Workout;
import com.Vcube.fitnesstracker.repo.WorkoutRepo;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

	@Autowired
	WorkoutRepo workoutRepo;

//	http://localhost:6666/workout/create
	@PostMapping("/create")
	Workout createData(@RequestBody Workout workout) {
		return workoutRepo.save(workout);

	}

//	http://localhost:6666/workout/getAllWorkouts
	@GetMapping("/getAllWorkouts")
	List<Workout> getAllUserDetails() {
		return workoutRepo.findAll();

	}

//	http://localhost:6666/workout/getWorkout/1
	@GetMapping("/getWorkout/{id}")
	Workout getUserDetailsById(@PathVariable Integer id) {
		return workoutRepo.findById(id).get();

	}

//	http://localhost:6666/workout/update/1
	@PutMapping("/update/{id}")
	Workout upDateWorkOutDetails(@RequestBody Workout w, @PathVariable Integer id) {
		Workout user = getUserDetailsById(id);
		user.setCaloriesBurned(w.getCaloriesBurned());
		user.setDuration(w.getDuration());
		user.setExercizeName(w.getExercizeName());
		return workoutRepo.save(user);

	}

//	http://localhost:6666/workout/delete/1
	@DeleteMapping("/delete/{id}")
	String deleteWorkoutInfo(@PathVariable Integer id) {
		workoutRepo.deleteById(id);
		return "Deleted Successfully";

	}

}
