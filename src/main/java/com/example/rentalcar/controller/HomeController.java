package com.example.rentalcar.controller;


import com.example.rentalcar.Services.CarService;
import com.example.rentalcar.model.Car;
import com.example.rentalcar.model.Dtos.CarDto;
import com.example.rentalcar.repository.CarRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Controller
public class HomeController {
    private CarRepository carRepository;
    private CarService carService;
    private Car car;

    public HomeController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/")
    public String getHomePage(Model model){

        model.addAttribute("cars", carService.getCarsDto());
        return "index";

    }
    @PreAuthorize(value = "hasRole('ADMIN')")
    @GetMapping("/cars")
    public String getCarsPage(Model model) {

        model.addAttribute("cars",carService.getCarsDto());
        return "cars";
    }

    @GetMapping("/delete")
    public String deletePlanet(@RequestParam(value = "car") String carName) {
        carService.deleteCar(carName);
        return "redirect:/cars";
    }

    @PostMapping("/add")
    public String addPlanet(@ModelAttribute CarDto carDto){
        carService.addCar(carDto);
        return "redirect:/cars";
    }
    @GetMapping("/login")
    public String loginPage(){

        return "login";
    }


    @GetMapping("/describe")
    public String describePage( Model model){

        model.addAttribute("cars", carService.getCarsDto());


        return "describe";
    }
    @GetMapping("/buy")
    public String ContactPage(){
        return "buy";
    }
}
