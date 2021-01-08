package com.pavlova.homeworks.lecture10;

public class Main {
    public static void main(String[] args) {

        CarStorage storage = new CarStorage();
        Car car1 = new SportCar(2010, "Germany", "BMW", 20000.0, "mini", 2015, new Owner("Vasya", "Pupkin", "Diakovich"), 201, 2, 200);
        Car car2 = new SportCar(2010, "Germany", "BMW", 20000.0, "mini", 2015, new Owner("Kris", "Pupkin", "Diakovich"), 202, 2, 200);
        Car car3 = new SportCar(2010, "Germany", "BMW", 20000.0, "mini", 2015, new Owner("Devid", "Pupkin", "Diakovich"), 200, 2, 200);
        Car car4 = new SportCar(2010, "Germany", "BMW", 20000.0, "mini", 2015, new Owner("Luis", "Pupkin", "Diakovich"), 200, 2, 200);
        storage.addToStorageOfSoldCars(car1);
        storage.addToStorageOfSoldCars(car2);
        storage.addToStorageOfSoldCars(car4);
        storage.printListOfSoldCars();
    }
}
