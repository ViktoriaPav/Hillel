package com.pavlova.lectures.lecture14;

import java.util.Arrays;

public class Stat<T extends Number> {
    private T[] data;

    public Stat(T[] data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(Arrays.toString(data));
    }

    public Double avarege() {
        double number = 0;
        for (T num : data) {
            number += num.doubleValue();
        }
        return number / data.length;
    }

    public boolean isSameAvarage(Stat<?> second) {
        return avarege().equals(second.avarege());
    }
}
