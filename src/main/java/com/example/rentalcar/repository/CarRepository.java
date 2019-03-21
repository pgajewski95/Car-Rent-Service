package com.example.rentalcar.repository;

import com.example.rentalcar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}