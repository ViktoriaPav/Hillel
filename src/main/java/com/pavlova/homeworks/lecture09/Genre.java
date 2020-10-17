package com.pavlova.homeworks.lecture09;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public enum Genre {
    FAIRY_TALE("Fairy_tale"),
    COMEDY("Comedy"),
    DOCUMENTARY("Documentary"),
    HORROR("Horror"),
    ADVENTURE("Adventure"),
    THRILLER("Thriller"),
    DETECTIVE("Detective");

    @Getter
    String genreLowerCase;
}
