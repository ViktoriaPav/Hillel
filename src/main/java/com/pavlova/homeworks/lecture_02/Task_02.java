package com.pavlova.homeworks.lecture_02;

public class Task_02 {

    private double calculateBMI(double weight, double height){
        double result;
        result = weight / Math.pow(height, 2);
        return result;
    }

    public String resultByIndexBMI(double weight, double height){
        String resultByIndexBMI = null;
        double bmi = calculateBMI(weight,height);
        if (bmi <= 18.5){
            resultByIndexBMI = "Underweight";
        } else if(bmi > 18.5 && bmi <= 25.0){
            resultByIndexBMI = "Normal";
        }else if (bmi > 25.0 && bmi <= 30.0){
            resultByIndexBMI = "Overweight";
        }else if(bmi > 30){
            resultByIndexBMI = "Obese";
        }

        return resultByIndexBMI;
    }

}
