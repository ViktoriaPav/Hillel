package com.pavlova.homeworks.lecture12;

public class Main {

    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Barsik", 12);
        Mouse mouse2 = new Mouse("Cheshka", 15);
        Mouse mouse3 = new Mouse("Pupsik", 16);
        Mouse mouse4 = new Mouse("Mursik", 14);
        Cat cat = new Cat();
        cat.eat(mouse1);
        cat.eat(mouse2);
        cat.eat(mouse3);
        cat.eat(mouse4);
        System.out.println(cat.toString());
    }
}
