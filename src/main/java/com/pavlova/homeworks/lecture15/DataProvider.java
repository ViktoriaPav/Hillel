package com.pavlova.homeworks.lecture15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class DataProvider {
    Queue<Person> people = new PriorityQueue<>();
    private DataMapper mapper = new DataMapper();

    public List<Person> provide(String fileName) {
        ArrayList<Person> result = new ArrayList<>();
        List<String> personsData = readDataFromFile(fileName);
        for (String s : personsData) {
            result.add(mapper.map(s));
        }
        return result;
    }

    private List<String> readDataFromFile(String fileName) {
        try {
            return Files.readAllLines(Path.of(fileName));
        } catch (IOException e) {
            System.out.println("No file");
            e.printStackTrace();
            return Collections.emptyList();
        }

    }
}
