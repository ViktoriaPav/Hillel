package com.pavlova.homeworks.lecture15;

import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class CovidStatImpl implements CovidStat {
    private final List<Person> persons;

    @Override
    public String getMostPopularName() {
        persons.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        int index = 0;
        int maxCounter = 1;
        int counter = 1;
        for (int i = 1; i < persons.size(); i++) {
            if (persons.get(i).getName().equals(persons.get(i - 1).getName())) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return persons.get(index).getName();
    }

    @Override
    public String getMostPopularSurname() {
        persons.sort(Comparator.comparing(Person::getSurname));
        int index = 0;
        int maxCounter = 1;
        int counter = 1;
        for (int i = 1; i < persons.size(); i++) {
            if (persons.get(i).getSurname().equals(persons.get(i - 1).getSurname())) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
            } else {
                counter = 1;
            }
        }
        return persons.get(index).getSurname();
    }

    @Override
    public String getMostPopularDomain() {
        TreeMap<String, Integer> domainsMap = new TreeMap<>();
        for (Person p : persons) {
            domainsMap.compute((p.getEmail().split("@")[1]), (key, oldValue) -> oldValue == null ? 1 : (oldValue + 1));
        }
        int maxCounter = 1;
        String mostPopularDomain = "";
        for (String key : domainsMap.keySet()) {
            if (domainsMap.get(key) > maxCounter) {
                mostPopularDomain = key;
                maxCounter = domainsMap.get(key);
            }
        }
        return mostPopularDomain;
    }

    @Override
    public double getAverageAge() {
        double sumOfAges = 0;
        for (Person person : persons) {
            sumOfAges += person.getAge();
        }
        return sumOfAges / persons.size();
    }

    @Override
    public double getAverageHeight() {
        double sumOfHeight = 0;
        for (Person person : persons) {
            sumOfHeight += person.getHeight();
        }
        return sumOfHeight / persons.size();
    }

    @Override
    public double getAverageWeight() {
        double sumOfWeight = 0;
        for (Person person : persons) {
            sumOfWeight += person.getWeight();
        }
        return sumOfWeight / persons.size();
    }
}
