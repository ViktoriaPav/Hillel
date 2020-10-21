package com.pavlova.homeworks.lecture11;

import org.apache.log4j.lf5.LogLevel;

import java.util.Date;

public class SoutLogger extends Logger {

    public SoutLogger(LogLevel defaultLevel) {
        super(defaultLevel);
    }

    @Override
    public void log(String message, LogLevel level) {
        System.out.println(getFormat().format(new Date()) + " " + level.getLabel() + ": " + message);
    }

}
