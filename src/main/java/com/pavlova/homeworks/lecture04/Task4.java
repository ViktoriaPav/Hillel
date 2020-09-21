package com.pavlova.homeworks.lecture04;

import java.util.regex.Pattern;

public class Task4 {

    private boolean checkValidNumber(String numbers){
        return Pattern.matches("[0-9]+", numbers);
    }

    public String replaceNumber(String numbers){

        if (checkValidNumber(numbers)){
            String firstReplace = numbers.replaceAll("[0-4]", "0");
            String secondReplace = firstReplace.replaceAll("[5-9]", "1");
        return secondReplace;
        }
        System.out.println("Error. It is not a number!");
        return null;
    }


}
