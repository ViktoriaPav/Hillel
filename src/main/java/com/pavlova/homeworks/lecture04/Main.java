package com.pavlova.homeworks.lecture04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Task 0
        Task0 task0 = new Task0();
        String word = s.nextLine();
        System.out.println(task0.revertsWord(word));

        // Task 1
        System.out.println("Please enter string:");
        String text = s.nextLine();
        System.out.println("Please enter length:");
        int length = s.nextInt();
        System.out.println(StringUtils.randomString(text, length));

//        AX6BYU56UX6CV6BNT7NM287430
//        AX6BYU56UX6CV6BNT7NM287431
        // Task 2
        System.out.println("Please enter product code");
        String code = s.nextLine();
        Task2 task2 = new Task2();
        System.out.println("Product code validation - " + task2.checkValidation(code));

        // Task 3
        Task3 task3 = new Task3();
        System.out.println("Please enter name:");
        String name = s.nextLine();
        System.out.println("User name is validate - " + task3.checkValidUserName(name));

        // Task 4
        System.out.println("Enter number:");
        String number = s.nextLine();
        Task4 task4 = new Task4();
        System.out.println(task4.replaceNumber(number));
    }
}
