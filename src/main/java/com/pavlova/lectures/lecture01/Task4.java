package com.pavlova.lectures.lecture01;

public class Task4 {

    protected String upperFirstLetterText(String text){
        String upperFirstLetter = new String();
        String[] textArray = text.split(" ");
        for (String o : textArray) {
            String upperText = o.substring(0, 1).toUpperCase() + o.substring(1);
            upperFirstLetter += upperText + " " ;
        }
        return upperFirstLetter;
    }
}
