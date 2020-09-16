package com.pavlova.lectures.lecture04;

public class Main {
    public static void main(String[] args) {
        int[] t = {5, 8, 3, 9, 10, 0};
        System.out.println("Min " + findMin(t));
        String s = "а она врет";
        String s1 = s.replace(" ", "");

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
    private static boolean checkPalindrome(String s){
        String s1 = s.replace(" ", "").toUpperCase();
        char [] t = s1.toCharArray();

        for(int i = 0, j = t.length; i < t.length/2 ; i++, j--)
            if (t[i] == ' '){
                i++;
                if (t[j] == ' '){

                }
            }

        return true;
    }


}
