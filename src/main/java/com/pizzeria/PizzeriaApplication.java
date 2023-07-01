package com.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.pizzeria"})
public class PizzeriaApplication {

    public static void main(String[] args) {

        SpringApplication.run(PizzeriaApplication.class, args);
    }

}
