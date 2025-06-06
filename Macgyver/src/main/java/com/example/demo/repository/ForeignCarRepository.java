package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ForeignCar;

public interface ForeignCarRepository extends JpaRepository<ForeignCar, Long>{
	Optional<ForeignCar> findByModel(String model);
}
