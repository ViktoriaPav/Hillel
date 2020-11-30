package com.pavlova.homeworks.lecture13;

import lombok.Data;

import java.util.*;

@Data
public class Cat {
    private List<Mouse> substance = new ArrayList<>();
    private Queue<Mouse> stomach = new PriorityQueue<>(5);

    public void eat(Mouse mouse) {
        if (stomach.size() < 5) {
            stomach.add(mouse);
        } else {
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

    private void createSubstance() {
        substance.addAll(stomach);
        stomach.clear();
    }

    private boolean isCatAteMouse(Mouse mouse) {
        return substance.contains(mouse);
    }
}
