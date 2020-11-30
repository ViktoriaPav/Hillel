package com.pavlova.homeworks.lecture04;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    private static Boolean checkValidation(String text) {
        boolean isValid = false;
        Pattern pattern = Pattern.compile("[a-z&0-9]+");
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    public static String randomString(String type, int length) {
        String text = type.replace(" ", "");
        if (checkValidation(text)) {
            char[] chars = new char[length];
            char[] typesArray = text.toCharArray();
            int start = 0;
            for (int i = 0, j = 0; i < chars.length; i++) {
                j = start + (int) (Math.random() * (typesArray.length - 1));
                chars[i] = typesArray[j];
            }
            return Arrays.toString(chars);
        }
        System.out.println("This string contains more than letters and numbers!");
        return null;
    }
}
