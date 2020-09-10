package com.pavlova.lectures.lecture_01;

public class Task_2 {

    int catYears;
    int dogYears;

    public int catYears(int HumanYears) {

        if (HumanYears >= 1) {
            catYears = 15;
        }
        if (HumanYears >= 2) {
            catYears = catYears + 9;
        }
        if (HumanYears >= 3) {
            catYears = catYears + (HumanYears - 2) * 4;
        }
        return catYears;
    }

    public int dogYears(int HumanYears) {

        if (HumanYears >= 1) {
            dogYears = 15;
        }
        if (HumanYears >= 2) {
            dogYears = dogYears + 9;
        }
        if (HumanYears >= 3) {
            dogYears = dogYears + (HumanYears - 2) * 5;
        }
        return dogYears;
    }

}
