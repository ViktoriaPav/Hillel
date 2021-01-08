package com.pavlova.homeworks.lecture11;

import lombok.Getter;
import org.apache.log4j.lf5.LogLevel;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Logger {
    private LogLevel defaultLevel;
    @Getter
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Logger(LogLevel defaultLevel) {
        this.defaultLevel = defaultLevel;
    }

    public void log(String message) {
        log(message, defaultLevel);
    }

    public abstract void log(String message, LogLevel level);
}
