package com.pavlova.homeworks.lecture10;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class Transport {
    private LocalDate yearOfIssue;
    private String countryOfOrigin;
}
