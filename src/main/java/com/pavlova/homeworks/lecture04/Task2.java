package com.pavlova.homeworks.lecture04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public Boolean checkValidation(String text) {
        boolean isValid = false;
        Pattern pattern = Pattern.compile("([A-Z&[0-9]]+)(\\d{6})");
        Matcher matcher = pattern.matcher(text);
        StringBuilder d = new StringBuilder();
        int a, b, c, lastNumber;
        if (matcher.matches()) {
            String numbers = text.replaceAll("[^0-9]", "");
            char[] f = numbers.toCharArray();
            if (f.length == 12) {
                a = Integer.parseInt(new StringBuilder().append(f[0]).append(f[1]).toString());
                b = Integer.parseInt(new StringBuilder().append(f[2]).append(f[3]).toString());
                c = Integer.parseInt(new StringBuilder().append(f[4]).append(f[5]).toString());
                for (int i = 6; i < 12; i++) {
                    d.append(f[i]);
                }
                lastNumber = Integer.parseInt(d.toString());
                if ((a * b * c) == lastNumber) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

}
