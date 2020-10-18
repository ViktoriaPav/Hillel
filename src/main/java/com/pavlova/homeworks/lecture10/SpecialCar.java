package com.pavlova.homeworks.lecture10;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class SpecialCar extends Car {
    private String kind;
    private int weight;

    public SpecialCar(int yearOfIssue, String countryOfOrigin, String brand, Double price, String equipment, int yearOfSell, Owner customer, String kind, int weight) {
        super(yearOfIssue, countryOfOrigin, brand, price, equipment, yearOfSell, customer);
        this.kind = kind;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SpecialCar{" + super.toString() +
                "kind='" + kind + '\'' +
                ", weight=" + weight +
                '}' + '\n';
    }
}
