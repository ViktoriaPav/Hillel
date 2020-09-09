package com.pavlova.lectures.lecture_01;

public class Task_1 {

    public void swap (int a, int b){
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);
    }

}
