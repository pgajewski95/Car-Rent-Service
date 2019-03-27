package com.example.rentalcar.model.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDto {


     private  Long id;
    private String carName;

    private long power;

    private double carMilage;

    private long yearOfProduction;

    private String color;

    private String carDescribtion;
    private String typeOfFuel;

    private String carPhoto;
    private long costs;

}