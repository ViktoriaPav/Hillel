package com.pavlova.homeworks.lecture_01;

public class Task_1 {

    public double calculateLogarithm(double a, double b) {
        double result;
        result = Math.log10(b) / Math.log10(a);
        return result;
    }

    public double calculateFormula19(double x) {
        double result;
        result = Math.acos(Math.tan(5 * x / Math.PI)) + Math.pow(x, 3.2) / 28;
        return result;
    }

    private double rootNDegree(double number, double nDegree) {
        return Math.pow(number, 1.0 / nDegree);
    }

        public double calculateFormula20(double x) {
        double result;
        result = (rootNDegree(Math.log(2) * x, 3)  + Math.tan(Math.cos(Math.PI)) * x ) * Math.abs(Math.log(x / 10.5) + 1 / 3);
        return result;
    }

    public double calculateFormula21(double x) {
        double result;
        System.out.println(rootNDegree(Math.log10(x), 4));
        result = (rootNDegree(Math.log10(x), 4) + Math.acos(x + 3)) * (1 / Math.abs(x + 2 * Math.pow(x, 2)));
        return result;
    }

    public double calculateFormula22(double x) {
        double result;
        result = Math.asin((Math.log10(x)/(Math.pow(x,2) + 5 * x + 1) - Math.pow(x, 3.2) / 28));
        return result;
    }

    public double calculateFormula23(double x) {
        double result;
        result = Math.acos(Math.tan(5 * x / Math.PI)) + Math.pow(x, 3.2) / 23;
        return result;
    }
    public double calculateFormula24(double x) {
        double result;
        result = Math.atan(Math.abs(8.3 - 21 * Math.pow(x, 2) - 0.8 * x) / rootNDegree(2.5 + 1 / Math.pow(x,2), 3));
        return result;
    }

    public double calculateFormula25(double x) {
        double result;
        result = rootNDegree(Math.log10(Math.acos((Math.abs(Math.pow(x, 3.4) + 2.5 * Math.pow(x, 1.2) - 0.7) / rootNDegree(Math.pow(Math.E, 2.5 * x), 3)))), 4) + 1;
        return result;
    }

    public double calculateFormula26(double x) {
        double result;
        result = Math.log(Math.abs(Math.sin(x))) + 2 * Math.pow(Math.E, x) + 2 * Math.cos(Math.abs(x)) + 2;
        return result;
    }
}
