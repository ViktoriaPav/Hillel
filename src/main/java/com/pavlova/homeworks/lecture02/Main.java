package com.pavlova.homeworks.lecture02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

//        Task 01
        System.out.println("Task 01. Please enter time:");
        double time = c.nextDouble();
        Task01 task01 = new Task01();
        System.out.println("time = " + time + " --> litres = " + task01.calculateLitres(time));

//        Task 02
        System.out.println("Task 02. Please enter your weight:");
        double weight = c.nextDouble();
        System.out.println("Please enter your height:");
        double height = c.nextDouble();
        Task02 task02 = new Task02();
        System.out.println(task02.resultByIndexBMI(weight, height));

//        Task 03
        System.out.println("Task 03. Please enter year:");
        int year = c.nextInt();
        Task03 task03 = new Task03();
        System.out.println("(" + task03.centuryFormYear(year) + ")");

//        Task 04
        System.out.println("Task 04. Enter your age:");
        int age = c.nextInt();
        Task04 task04 = new Task04();
        System.out.println(task04.years(age));
    }
}
