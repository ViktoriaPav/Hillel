package com.pavlova.homeworks.lecture11;

public class Main {
    public static void main(String[] args) {
        Logger l = new FileLogger();
        Logger l1 = new SoutLogger();
        l.outWriter("Message to Log");
        l1.outWriter("Message to Log");
    }
}
