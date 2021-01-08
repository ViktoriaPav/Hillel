package com.pavlova.homeworks.lecture15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataProviderTest {

    @Test
    void provide() {
        assertNotNull(new DataProvider().provide("data.csv"));
    }

    @Test
    void provideWithNotExistingFile() {
        assertFalse(new DataProvider().provide("data.csv").isEmpty());
    }

    @Test
    void provideHappyPath() throws IOException {
        List<Person> personList = new DataProvider().provide("data.csv");
        assertFalse(personList.isEmpty());
    }
}