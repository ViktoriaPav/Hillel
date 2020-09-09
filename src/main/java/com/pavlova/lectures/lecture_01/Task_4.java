package com.pavlova.lectures.lecture_01;

public class Task_4 {

    protected String UpperFirstLetterText (String text){
        String UpperFirstLetter = new String();
        String[] textArray = text.split(" ");
        for (String o : textArray) {
            String UpperText = o.substring(0, 1).toUpperCase() + o.substring(1);
            UpperFirstLetter += UpperText + " " ;
        }
        return UpperFirstLetter;
    }
}
