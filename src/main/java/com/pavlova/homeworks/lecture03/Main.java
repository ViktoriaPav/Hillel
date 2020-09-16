package com.pavlova.homeworks.lecture03;

public class Main {
    public static void main(String[] args) {

        double d=3.14159265359;
        float f=(float) d; // Потеря точности
        System.out.println(f); // 3.1415927
        int i = 257;
        byte b = (byte) i; // Потеря значимости
        System.out.println (b); // 1

        int chinaPopulation = 1360000000;
        int indiaPopulation = 1240000000;
        int total = chinaPopulation + indiaPopulation;
        System.out.println(total); // ???

        byte b1=1;
        byte b2=2;
//        byte b33=b1+b2; // Ошибка компиляции

        int i1 = 123456789;
        float f1 = i;
        double d1 = i;
        short s = (short) i;
        System.out.println("int: " + i1);
        System.out.println("float: " + f1);
        System.out.println("double: " + d1);
        System.out.println("short: " + s);

        int a=1;
        int b23=0;
        int c=a/b23;
        System.out.println(c);

        double a3=1;
        double b4=0;
        double c3=a3/b4;
        System.out.println(c3);
        System.out.println("c+1 = " + (c3 + 1));
        System.out.println("+0.0 == -0.0 : " + (0.0 == -0.0));
        System.out.println("a/(+0.0) = " + (a3/(+0.0)));
        System.out.println("a/(-0.0) = " + (a3/(-0.0)));

    }
}
