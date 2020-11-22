package com.pavlova.homeworks.lecture15;

public class DataMapper {

    public Person map(String file) {
        String[] data = file.split(",");
        Person x= new Person.PersonBuilder().
                name(data[0]).
                surname(data[1]).
                age(Integer.parseInt(data[2])).
                height(Integer.parseInt(data[3])).
                weight(Integer.parseInt(data[4])).
                email(data[5]).build();

        return x;
    }
}
