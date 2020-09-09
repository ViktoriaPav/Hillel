package com.pavlova.lectures.lecture_01;

public class Task_3 {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            System.out.println("*");
            for (int j = 0; j < 23; j++) {
//                for (int k = 5; k > 0 ; k--) {
                if (j == 0 || i == 0 || j == 6 || i == 6 || j == 8 || j == 14 || j == 16 || j == 22) {
                    System.out.print(" #");
                } else {
                    System.out.print("  ");
//                }
                }
            }
        }
    }
}
