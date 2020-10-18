package com.pavlova.homeworks.lecture11;

public class SoutLogger extends Logger {

    @Override
    public void outWriter(String message) {
        System.out.println(super.log(message));
    }
}
