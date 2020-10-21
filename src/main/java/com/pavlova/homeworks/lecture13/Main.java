package com.pavlova.homeworks.lecture13;

public class Main {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Barsik", 412);
        Mouse mouse2 = new Mouse("Jerry", 460);
        Mouse mouse3 = new Mouse("Pupsik", 160);
        Mouse mouse4 = new Mouse("Mursik", 145);
        Mouse mouse5 = new Mouse("Jerry1", 145);
        Mouse mouse6 = new Mouse("Jerry2", 145);
        Cat cat = new Cat();
        cat.eat(mouse1);
        cat.eat(mouse2);
        cat.eat(mouse3);
        cat.eat(mouse4);
        cat.eat(mouse5);
        cat.eat(mouse6);
        System.out.println("Mouse go out from stomach" + cat.mouseOut());
        System.out.println(cat.toString());
        cat.allMouseOut(mouse2);
        System.out.println(cat.toString());
    }
}
