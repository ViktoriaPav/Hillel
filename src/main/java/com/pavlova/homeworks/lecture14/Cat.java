package com.pavlova.homeworks.lecture14;

import lombok.ToString;

@ToString
public class Cat extends Pet {
    @Override
    public void prin() {
        System.out.println("It is Cat");
    }
}
