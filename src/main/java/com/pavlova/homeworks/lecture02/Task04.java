package com.pavlova.homeworks.lecture02;

public class Task04 {
    public String years(int age) {
        return (age <= 12) ? "You`re a(n) kid" :
                (age > 12 && age <= 17) ? "You`re a(n) teenager" :
                        (age > 17 && age <= 64) ? "You`re a(n) adult" :
                                "You`re a(n) elderly";
    }
}
