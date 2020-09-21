package com.pavlova.lectures.lecture04;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] t = {5, 8, 3, 9, 10, 0};
        System.out.println("Min " + findMin(t));
        String s1 = "Refer";
        String s2 = "Step on no pets";
        System.out.println("This " + checkPalindrome(s1));
        Integer y = 145;
        System.out.println(isFactorials(y));

    }

    private static int findMin(int[] ar) {
        int min = ar[0];
        for (int a : ar) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    private static boolean checkPalindrome(String s) {
        String s1 = s.replace(" ", "").toLowerCase();
        char[] t = s1.toCharArray();
        boolean result = false;
        for (int i = 0, j = t.length - 1; i < t.length / 2; i++, j--) {
            if (t[i] == t[j]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isFactorials(Integer x) {
        boolean result = false;
        String numbers[] = x.toString().split("");
        Integer[] t = new Integer[x.toString().length()];
        Integer sumFactorial = 0;

        for (int i = 0; i < t.length; i++) {
            t[i] = Integer.parseInt(numbers[i]);
            sumFactorial += calculateFactorial(t[i]);
        }
        if (x.equals(sumFactorial)) {
            result = true;
        }
        return result;
    }

    private static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 0; i < n; i++) {
            factorial += factorial * i;
        }
        return factorial;
    }
}
