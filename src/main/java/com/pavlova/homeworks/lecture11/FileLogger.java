package com.pavlova.homeworks.lecture11;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {

    @Override
    public void outWriter(String message) {
        try (FileWriter fileWriter = new FileWriter("logger.txt")) {
            fileWriter.write(super.log(message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
