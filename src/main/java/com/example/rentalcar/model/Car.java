package com.example.rentalcar.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "car_name", unique = true, nullable = false)
    private String carName;
    @Column(name = "power")
    private long power;
    @Column(name = "car_milage")
    private double carMilage;
    @Column(name = "year_of_production")
    private long yearOfProduction;
    @Column(name = "color")
    private String color;
    @Column(name = "car_describtion")
    private String carDescribtion;
    @Column(name = "car_photo")
    private String carPhoto;
    @Column(name = "costs")
    private long costs;
    @Column(name = "type_of_fuel")
    private String typeOfFuel;
}
