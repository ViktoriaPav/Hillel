package com.pavlova.lectures.lecture01;

public class Task1 {

    public void swap (int a, int b){
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);
    }

}
