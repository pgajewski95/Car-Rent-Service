package com.example.rentalcar.Services;


import com.example.rentalcar.CarMapper;
import com.example.rentalcar.model.Car;
import com.example.rentalcar.model.Dtos.CarDto;
import com.example.rentalcar.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    //Dao
    public List<Car> getCars(){return carRepository.findAll();}
    //DTO
    public List<CarDto> getCarsDto(){
        return carRepository.findAll()
                .stream()
                .map(carMapper::map)
                .collect(Collectors.toList());
    }




}
