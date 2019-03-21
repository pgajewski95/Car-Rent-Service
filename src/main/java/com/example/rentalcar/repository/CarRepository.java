package com.example.rentalcar.repository;

import com.example.rentalcar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CarRepository extends JpaRepository<Car, Long> {




    @Query(value = "delete from cars where car_name = ?1", nativeQuery = true) //SQL
    @Transactional
    @Modifying
    void deleteByCarName(String planetName);


}
