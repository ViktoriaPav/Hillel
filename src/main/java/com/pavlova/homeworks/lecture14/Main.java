package com.pavlova.homeworks.lecture14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public void iterateAnimals(Collection<? extends Animal> collection){
        for(Animal animal: collection) {
            System.out.println(animal);
        }
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        new Main().iterateAnimals(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        new Main().iterateAnimals(dogs);
    }
}
