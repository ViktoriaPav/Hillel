package com.pavlova.homeworks.lecture13;

public class Main {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Barsik1", 412);
        Mouse mouse2 = new Mouse("Jerry2", 460);
        Mouse mouse3 = new Mouse("Pupsik3", 160);
        Mouse mouse4 = new Mouse("Mursik4", 145);
        Mouse mouse5 = new Mouse("Jerry5", 145);
        Mouse mouse6 = new Mouse("Jerry6", 145);
        Cat cat = new Cat();
        cat.eat(mouse1);
        cat.eat(mouse2);
        cat.eat(mouse3);
        cat.eat(mouse4);
        cat.eat(mouse5);
        cat.eat(mouse6);
        System.out.println(cat.toString());
        System.out.println("Mouse go out from stomach " + cat.mouseOut());
        cat.eat(mouse6);
        System.out.println(cat.toString());
        cat.allMouseOut(mouse2);
        System.out.println(cat.toString());
    }
}
