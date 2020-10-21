package com.pavlova.homeworks.lecture13;

import lombok.Data;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

@Data
public class Cat {
    Queue<Mouse> stomach = new ArrayBlockingQueue<>(5);
    List<Mouse> substance = new ArrayList<>();

    public void eat(Mouse mouse) {
        try {
            stomach.add(mouse);
        } catch (Exception e) {
            System.out.println("Error: stomach is full and can`t eat " + mouse);
        }
    }

    public Mouse mouseOut() {
        return stomach.poll();
    }

    public void allMouseOut(Mouse mouse) {
        createSubstance();
        System.out.println(substance);
        if (isCatAteMouse(mouse)) {
            System.out.println("Cat has ate " + mouse);
        } else {
            System.out.println("Cat has not ate " + mouse);
        }
    }

    private List createSubstance() {
        substance.addAll(stomach);
        stomach.clear();
        return substance;
    }

    private boolean isCatAteMouse(Mouse mouse) {
        return substance.contains(mouse);
    }
}
