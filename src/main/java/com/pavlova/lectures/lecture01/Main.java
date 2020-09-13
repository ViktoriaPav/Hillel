package com.pavlova.lectures.lecture01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //Task 1
        System.out.println("Task #1. Please enter a:");
        int a = s.nextInt();
        System.out.println("Task #1. Please enter b:");
        int b = s.nextInt();
        Task1 task_1 = new Task1();
        task_1.swap(a, b);

        // Task 2
        System.out.println("Task #2. Please enter human years:");
        int HumanYears = s.nextInt();
        Task2 task_2 = new Task2();
        System.out.println("HumanYears: " + HumanYears);
        System.out.println("CatYears: " + task_2.catYears(HumanYears));
        System.out.println("DogYears: " + task_2.dogYears(HumanYears));

        // Task 3 - not done

        // Task 4
        System.out.println("Task #4. Please enter text:");
        Task4 task_4 = new Task4();
        String text = sc.nextLine();
        System.out.println(task_4.upperFirstLetterText(text));
    }
}

