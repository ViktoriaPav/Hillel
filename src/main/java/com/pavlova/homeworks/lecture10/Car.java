package com.pavlova.homeworks.lecture10;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Car extends Transport {
    private String brand;
    private Double price;
    private String equipment;
    private LocalDate yearOfSell;
    private Owner customer;
}
