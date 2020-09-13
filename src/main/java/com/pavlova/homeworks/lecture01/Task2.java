package com.pavlova.homeworks.lecture01;

public class Task2 {
    public double calculateAreaOfTriangle(double a, double b, double c) {
        double p = perimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double perimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }
}
