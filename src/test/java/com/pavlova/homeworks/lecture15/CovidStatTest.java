package com.pavlova.homeworks.lecture15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CovidStatTest {
    List<Person> people;
    CovidStat stat;

    @BeforeEach
    void setUp() {
        people = new ArrayList<>(List.of(
                new Person.PersonBuilder().name("Ab").surname("Bd").age(10).weight(20).height(120).email("gjhj@gmail.net").build(),
                new Person.PersonBuilder().name("Ab").surname("Bc").age(20).weight(40).height(150).email("gjhj@mail.ru").build(),
                new Person.PersonBuilder().name("Bb").surname("Bc").age(30).weight(60).height(160).email("gjhj@mail.ru").build(),
                new Person.PersonBuilder().name("Ab").surname("Cc").age(40).weight(50).height(200).email("gjhj@gmail.com").build(),
                new Person.PersonBuilder().name("Cb").surname("Cc").age(50).weight(40).height(190).email("gjhj@gmail.com").build(),
                new Person.PersonBuilder().name("Db").surname("Ac").age(30).weight(60).height(170).email("gjhj@gmail.com").build()
        ));
        stat = new CovidStatImpl(people);
    }

    @Test
    void getMostPopularName() {
        assertEquals("Ab", stat.getMostPopularName());
    }

    @Test
    void getMostPopularSurname() {
        assertEquals("Bc", stat.getMostPopularSurname());
    }

    @Test
    void getMostPopularDomain() {
        assertEquals("gmail.com", stat.getMostPopularDomain());
    }

    @Test
    void getAverageAge() {
        assertEquals(30, stat.getAverageAge());
    }


    @Test
    void getAverageHeight() {
        assertEquals(165, stat.getAverageHeight());
    }

    @Test
    void getAverageWeight() {
        assertEquals(45, stat.getAverageWeight());
    }
}