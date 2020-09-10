package com.pavlova.homeworks.lecture_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

//        Task 01
        System.out.println("Task 01. Please enter time:");
        double time = c.nextDouble();
        Task_01 task_01 = new Task_01();
        System.out.println("time = " + time + " --> litres = " + task_01.calculateLitres(time));

//        Task 02
        System.out.println("Task 02. Please enter your weight:");
        double weight = c.nextDouble();
        System.out.println("Please enter your height:");
        double height = c.nextDouble();
        Task_02 task_02 = new Task_02();
        System.out.println(task_02.resultByIndexBMI(weight, height));

////        Task 03
//        System.out.println("Task 03. Please enter year:");
//        int year = c.nextInt();
//        Task_03 task_03 = new Task_03();
//        System.out.println("(" + task_03.centuryFormYear(year) + ")");
//
////        Task 04
//        System.out.println("Task 04. Enter your age:");
//        int age = c.nextInt();
//        Task_04 task_04 = new Task_04();
//        System.out.println(task_04.years(age));
    }
}
