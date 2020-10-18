package com.pavlova.homeworks.lecture10;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
public class Car extends Transport {
    private String brand;
    private Double price;
    private String equipment;
    private int yearOfSell;
    private Owner customer;

    public Car(int yearOfIssue, String countryOfOrigin, String brand, Double price, String equipment, int yearOfSell, Owner customer) {
        super(yearOfIssue, countryOfOrigin);
        this.brand = brand;
        this.price = price;
        this.equipment = equipment;
        this.yearOfSell = yearOfSell;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return super.toString() +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", equipment='" + equipment + '\'' +
                ", yearOfSell=" + yearOfSell +
                ", customer=" + customer;
    }
}
