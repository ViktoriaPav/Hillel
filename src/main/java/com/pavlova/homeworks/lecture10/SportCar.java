package com.pavlova.homeworks.lecture10;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class SportCar extends Car {
    private int maxSpeed;
    private int engineCapacity;
    private int power;

    public SportCar(int yearOfIssue, String countryOfOrigin, String brand, Double price, String equipment, int yearOfSell, Owner customer, int maxSpeed, int engineCapacity, int power) {
        super(yearOfIssue, countryOfOrigin, brand, price, equipment, yearOfSell, customer);
        this.maxSpeed = maxSpeed;
        this.engineCapacity = engineCapacity;
        this.power = power;
    }

    @Override
    public String toString() {
        return "SportCar{" + super.toString() +
                "maxSpeed=" + maxSpeed +
                ", engineCapacity=" + engineCapacity +
                ", power=" + power +
                '}' + '\n';
    }
}
