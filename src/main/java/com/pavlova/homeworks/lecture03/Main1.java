package com.pavlova.homeworks.lecture03;

public class Main1 {
    public static void main(String[] args) {
        String s1 = "abc" + 2 + 2; // В s1 запишется abc22
        String s2 = 2 + 2 + "abc"; // В s1 запишется 4abc

        double d = 3.14159265359;
        float f = (float) d; // Потеря точности
        System.out.println(f); // 3.1415927
        int i = 257;
        byte b = (byte) i; // Потеря значимости
        System.out.println(b); // 1

        int chinaPopulation = 1360000000;
        int indiaPopulation = 1240000000;
        int total = chinaPopulation + indiaPopulation;
        System.out.println("total : " + total); //  -1694967296

        byte b1 = 1;
        byte b2 = 2;
//        byte b3=b1+b2; // Ошибка компиляции

        int i1 = 123456789;
        float f1 = i;
        double d1 = i;
        short s = (short) i1;
        System.out.println("int: " + i1); // 123456789
        System.out.println("float: " + f1); // 257.0
        System.out.println("double: " + d1); // 257.0
        System.out.println("short: " + s); // -13035

        int a6 = 1;
        int b6 = 0;
        int c6 = a6 / b6;
        System.out.println("c6: " + c6); //  Exception in thread "main" java.lang.ArithmeticException: / by zero

        double a7 = 1;
        double b7 = 0;
        double c7 = a7 / b7;
        System.out.println(c7); // Infinity
        System.out.println("c+1 = " + (c7 + 1)); // c+1 = Infinity
        System.out.println("+0.0 == -0.0 : " + (0.0 == -0.0)); // +0.0 == -0.0 : true
        System.out.println("a/(+0.0) = " + (a7 / (+0.0))); // a/(+0.0) = Infinity
        System.out.println("a/(-0.0) = " + (a7 / (-0.0))); //  a/(-0.0) = -Infinity


        double a8 = 0;
        double b8 = 0;
        double c8 = a8 / b8;
        System.out.println("c =" + c8); // c =NaN
        System.out.println("c+0 =" + (c8 + 0)); // c+0 =NaN
        System.out.println("c<0 =" + (c8 < 0)); // c<0 =false
        System.out.println("c>0 =" + (c8 > 0)); // c>0 =false
        System.out.println("c==0 =" + (c8 == 0)); // c==0 =false
        System.out.println("c!=0 =" + (c8 != 0)); // c!=0 =true
        System.out.println("c==c =" + (c8 == c8)); // c==c =false
        System.out.println("c!=c =" + (c8 != c8)); // c!=c =true
        System.out.println("c == NaN: " + (c8 == Double.NaN)); // :)))  c == NaN: false
        System.out.println("c is NaN: " + Double.isNaN(c8)); // Делайте именно так  c is NaN: true
    }
}
