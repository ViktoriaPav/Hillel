package com.pavlova.homeworks.lecture04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Task 0
        Task0 task0 = new Task0();
        String word = s.nextLine();
        System.out.println(task0.revertsWord(word));
    }

}
