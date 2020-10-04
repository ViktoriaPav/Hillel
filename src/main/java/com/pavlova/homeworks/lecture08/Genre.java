package com.pavlova.homeworks.lecture08;

public enum Genre {
    FAIRY_TALE("fairy_tale"),
    COMEDY("comedy"),
    DOCUMENTARY("documentary"),
    HORROR("horror"),
    ADVENTURE("adventure"),
    THRILLER("thriller"),
    DETECTIVE("detective");

    Genre(String genreLowerCase) {
        this.genreLowerCase = genreLowerCase;
    }

    String genreLowerCase;


}
