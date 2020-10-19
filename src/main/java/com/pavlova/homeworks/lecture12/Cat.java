package com.pavlova.homeworks.lecture12;

import lombok.Data;

import java.util.ArrayDeque;
import java.util.Queue;

@Data
public class Cat {
    Queue<Mouse> stomach = new ArrayDeque<>(3);

    public Queue eat(Mouse mouse) {
        int i = stomach.size();
        if(i < 3) {
            stomach.add(mouse);
        } else {
            System.out.println("Error: stomach is full and can`t eat this mouse!");
        }
        return stomach;
    }

    public Queue mouseOut() {
        stomach.poll();
        return stomach;
    }

    public Queue allMouseOut() {
        stomach.removeAll(stomach);
        return stomach;
    }
}
