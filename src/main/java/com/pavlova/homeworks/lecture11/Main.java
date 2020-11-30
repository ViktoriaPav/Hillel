package com.pavlova.homeworks.lecture11;

import org.apache.log4j.lf5.LogLevel;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger l = new FileLogger(LogLevel.CONFIG);
        Logger l1 = new SoutLogger(LogLevel.DEBUG);
        l.log("Message to Log");
        l1.log("Message to Log");

        Thread.sleep(2000);
        l.log("Message to Log", LogLevel.INFO);
        l1.log("Message to Log", LogLevel.INFO);
    }
}
