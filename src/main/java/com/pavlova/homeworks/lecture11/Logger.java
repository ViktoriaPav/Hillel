package com.pavlova.homeworks.lecture11;

import lombok.Getter;
import org.apache.log4j.lf5.LogLevel;
import java.text.SimpleDateFormat;

public abstract class Logger {
    @Getter
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public abstract void log(String message);

    public abstract void log(String message, LogLevel level);


}
