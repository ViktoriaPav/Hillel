package com.pavlova.homeworks.lecture04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public boolean checkValidUserName(String name){
        boolean res = false;
        Pattern pattern = Pattern.compile("[a-z&0-9&_]{4,16}");
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            res = true;
        }
        return res;
    }
}
