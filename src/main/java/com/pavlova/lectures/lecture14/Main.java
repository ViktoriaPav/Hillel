package com.pavlova.lectures.lecture14;

public class Main {

    public static void main(String[] args) {
        Integer[] inttt = {5, 5, 9, 12};
        Double[] dob1 = {5.0, 8.0, 8.0};
        Integer[] integers = {5, 8, 8};
        Double[] dob3 = {5.8, 8.9, 7.5};

        Stat<Integer> integerStat = new Stat<>(inttt);
        Stat<Integer> integerStat1 = new Stat<>(integers);

        Stat<Double> firstDobOb = new Stat<>(dob1);
        Stat<Double> notSame = new Stat<>(dob3);
        firstDobOb.printData();

        System.out.println(firstDobOb.isSameAvarage(integerStat));
        System.out.println(firstDobOb.isSameAvarage(integerStat1));
        System.out.println(firstDobOb.isSameAvarage(notSame));

    }
}
