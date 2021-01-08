package com.pavlova.homeworks.lecture10;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class Transport {
    private int yearOfIssue;
    private String countryOfOrigin;

    @Override
    public String toString() {
        return "Transport{" +
                "yearOfIssue=" + yearOfIssue +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
