package com.pavlova.homeworks.lecture15;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data @Builder @AllArgsConstructor
public class Person implements Comparable {
    private final String name;
    private final String surname;
    private final int age;
    private final int height;
    private final int weight;
    private final String email;

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        int result = getName().compareTo(person.getName());
        if (result == 0) {
            result = getSurname().compareTo(person.getSurname());
        }
        return result;
    }
}
