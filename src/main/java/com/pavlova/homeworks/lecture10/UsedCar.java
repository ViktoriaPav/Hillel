package com.pavlova.homeworks.lecture10;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class UsedCar extends Car {
    private int mileage;
    private Owner owner;

    public UsedCar(int yearOfIssue, String countryOfOrigin, String brand, Double price, String equipment, int yearOfSell, Owner customer, int mileage, Owner owner) {
        super(yearOfIssue, countryOfOrigin, brand, price, equipment, yearOfSell, customer);
        this.mileage = mileage;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "UsedCar{" + super.toString() +
                "mileage=" + mileage +
                ", owner=" + owner +
                '}' + '\n';
    }
}
