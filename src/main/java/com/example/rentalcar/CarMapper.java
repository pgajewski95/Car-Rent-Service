package com.example.rentalcar;

import com.example.rentalcar.commons.Mapper;
import com.example.rentalcar.model.Car;
import com.example.rentalcar.model.Dtos.CarDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class CarMapper implements Mapper<Car, CarDto> {
    @Override
    public CarDto map(Car c) {




        return CarDto.builder()
                .carName(c.getCarName())
                .power(c.getPower())
                .carMilage(c.getCarMilage())
                .yearOfProduction(c.getYearOfProduction())
                .color(c.getColor())
                .carDescribtion(c.getCarDescribtion())
                .carPhoto(c.getCarPhoto())
                .costs(c.getCosts())
                .typeOfFuel(c.getTypeOfFuel())
                .build();
    }

    @Override
    public Car reverse(CarDto to) {
        return Car.builder()
                .carName(to.getCarName())
                .power(to.getPower())
                .carMilage(to.getCarMilage())
                .yearOfProduction(to.getYearOfProduction())
                .color(to.getColor())
                .carDescribtion(to.getCarDescribtion())
                .carPhoto(to.getCarPhoto())
                .costs(to.getCosts())
                .typeOfFuel(to.getTypeOfFuel())
                .build();

    }



}

