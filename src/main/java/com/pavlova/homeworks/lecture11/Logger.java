package com.pavlova.homeworks.lecture11;

import org.apache.log4j.lf5.LogLevel;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Logger {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String log(String message) {
        return format.format(new Date()) + " " + log(message, LogLevel.INFO);
    }

    public String log(String message, LogLevel level) {
        return level.getLabel() + ": " + message;
    }

    abstract void outWriter(String message);
}
