package com.pavlova.homeworks.lecture02;

public class Task02 {

    private double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    public String resultByIndexBMI(double weight, double height) {
        double bmi = calculateBMI(weight, height);
        return (bmi <= 18.5) ? "Underweight" :
                (bmi > 18.5 && bmi <= 25.0) ? "Normal" :
                        (bmi > 25.0 && bmi <= 30.0) ? "Overweight" :
                                "Obese";
    }
}
