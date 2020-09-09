package com.pavlova.homeworks.lecture_01;

public class Task_2 {
    public double calculateAreaOfTriangle (double a, double b, double c){
        double s;
        double p = perimeter(a, b, c);
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    private double perimeter (double a, double b, double c){
        double p = (a + b + c) / 2;
        return p;
    }
}
