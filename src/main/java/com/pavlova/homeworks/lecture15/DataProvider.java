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
    private DataMapper mapper;

    public List<Person> provide(String fileName) {
        ArrayList<Person> result = new ArrayList<>();
        List<String> personsData = readDataFromFile(fileName);
        for (String s : personsData) {
            result.add( mapper.map(s));
        }
        return null;
    }

    private List<String> readDataFromFile(String fileName) {
        try {
            return Files.readAllLines(Path.of("fileName"));
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }

    }
//
//    public List<Person> DataMapper(String fileName) {
//
//        return null;
//    }


}
