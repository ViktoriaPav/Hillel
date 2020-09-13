package com.pavlova.homeworks.lecture01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //Task 1
        Task1 task1 = new Task1();
        System.out.println("Please enter a: ");
        double a = s.nextDouble();
        System.out.println("Please enter a: ");
        double b = s.nextDouble();
        System.out.println(task1.calculateLogarithm(a, b));

        System.out.println("Please enter x for calculate formula #19: ");
        double x = s.nextDouble();
        System.out.println(task1.calculateFormula19(x));

        System.out.println("Please enter x for calculate formula #20: ");
        double x11 = s.nextDouble();
        System.out.println(task1.calculateFormula20(x11));

        System.out.println("Please enter x for calculate formula #21: ");
        double x1 = s.nextDouble();
        System.out.println(task1.calculateFormula21(x1));

        System.out.println("Please enter x for calculate formula #23: ");
        double x2 = s.nextDouble();
        System.out.println(task1.calculateFormula23(x2));

        System.out.println("Please enter x for calculate formula #24: ");
        double x3 = s.nextDouble();
        System.out.println(task1.calculateFormula24(x3));

        System.out.println("Please enter x for calculate formula #25: ");
        double x4 = s.nextDouble();
        System.out.println(task1.calculateFormula25(x4));

        System.out.println("Please enter x for calculate formula #26: ");
        double x5 = s.nextDouble();
        System.out.println(task1.calculateFormula26(x5));

        //Task #2
        Task2 task2 = new Task2();
        System.out.println("Task #2. Please enter a: ");
        double a2 = s.nextDouble();
        System.out.println("Task #2. Please enter b: ");
        double b2 = s.nextDouble();
        System.out.println("Task #2. Please enter c: ");
        double c2 = s.nextDouble();
        System.out.println("Area of triangle: " + task2.calculateAreaOfTriangle(a2, b2, c2));

        //Task #3
        Task3 task3 = new Task3();
        System.out.println("Task #3. Please enter a: ");
        int a3 = sc.nextInt();
        System.out.println("Task #3. Please enter b: ");
        int b3 = sc.nextInt();
        System.out.println("Task #3. Please enter c: ");
        int c3 = sc.nextInt();
        double[] t = task3.solveQuadraticEquation(a3, b3, c3);
        System.out.println(t[0] + ", " + t[1]);
    }
}



