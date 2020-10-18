package com.pavlova.homeworks.lecture10;

import lombok.Data;

@Data
public class UsedCar extends Car{
    private int mileage;
    private Owner owner;
}
