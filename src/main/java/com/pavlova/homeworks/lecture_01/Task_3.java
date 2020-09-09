package com.pavlova.homeworks.lecture_01;

public class Task_3 {

    public double[] solveQuadraticEquation(int a, int b, int c) {
        double[] result = new double[2];
        double d = d(a, b, c);
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            result[0] = Math.min(x1, x2);
            result[1] = Math.max(x1, x2);
        } else if (d == 0) {
            result[0] = -b / 2 * a;
        } else {
            System.out.println("The equation has no roots.");
        }
        return result;
    }

    private double d(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

}
