package com.example.rentalcar.controller;


import com.example.rentalcar.Services.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private CarService carService;

    public HomeController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/")
    public String getHomePage(Model model){

        System.out.println("Hello");
        return "index";

    }
    @GetMapping("/cars")
    public String getCarsPage(Model model) {

        model.addAttribute("cars",carService.getCarsDto());
        return "cars";
    }
}
