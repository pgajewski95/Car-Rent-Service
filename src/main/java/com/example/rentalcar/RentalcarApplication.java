package com.example.rentalcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:config.properties")
@SpringBootApplication
public class RentalcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentalcarApplication.class, args);
    }

}
