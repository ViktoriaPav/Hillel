package com.pavlova.lectures.lecture05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Jav.*");
        String s1 = "Java";
        String s2 = "Java 11";



        Pattern.matches("J.*", "Java");
        Matcher matcher = pattern.matcher(s1);
        System.out.println(matcher.matches());

        Matcher matcher1 = pattern.matcher(s2);
        System.out.println(matcher1.matches());
        System.out.println(matcher.find());

    }
//    private static int M(int a, int...b){
//       int result;
//
//        return
//    }
}
