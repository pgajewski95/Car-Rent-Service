package com.example.rentalcar.controller;

import com.example.rentalcar.Services.CarService;
import com.example.rentalcar.model.Car;
import com.example.rentalcar.model.Dtos.CarDto;
import com.example.rentalcar.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    /*

    DAO

     */
    @GetMapping("/cars")
    public List<Car> getCars() {
        carService.getCars();
        return carService.getCars();

    }




}
