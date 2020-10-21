package com.pavlova.homeworks.lecture11;

import org.apache.log4j.lf5.LogLevel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger extends Logger {

    public FileLogger(LogLevel defaultLevel) {
        super(defaultLevel);
    }

    @Override
    public void log(String message, LogLevel level) {
        try (FileWriter fileWriter = new FileWriter("logger.txt")) {
            fileWriter.write(getFormat().format(new Date()) + " " + level.getLabel() + ": " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
