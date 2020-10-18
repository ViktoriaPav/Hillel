package com.pavlova.homeworks.lecture11;

import org.apache.log4j.lf5.LogLevel;

public class Main {
    public static void main(String[] args) {
        Logger l = new FileLogger();
        Logger l1 = new SoutLogger();
        l.log("Message to Log");
        l.log("Message to Log", LogLevel.INFO);
        l1.log("Message to Log");
        l1.log("Message to Log", LogLevel.INFO);
    }
}
