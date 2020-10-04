package com.pavlova.homeworks.lecture08;

public enum Genre {
    FAIRY_TALE("Fairy_tale"),
    COMEDY("Comedy"),
    DOCUMENTARY("Documentary"),
    HORROR("Horror"),
    ADVENTURE("Adventure"),
    THRILLER("Thriller"),
    DETECTIVE("Detective");

    Genre(String genreLowerCase) {
        this.genreLowerCase = genreLowerCase;
    }

    String genreLowerCase;

    @Override
    public String toString() {
        return "Genre{" +
                "genreLowerCase='" + genreLowerCase + '\'' +
                '}';
    }
}
