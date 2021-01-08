package com.pavlova.homeworks.lecture14;

import lombok.ToString;

@ToString
public class Dog extends Pet {
    @Override
    public void prin() {
        System.out.println("It is Dog");
    }
}
