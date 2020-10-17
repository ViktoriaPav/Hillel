package com.pavlova.homeworks.lecture09;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;
import java.text.SimpleDateFormat;
import java.util.Date;

@Value
public class Author  {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    @Getter(AccessLevel.NONE)
    private SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");

    public Date getDateOfBirth() {
        return new Date(this.dateOfBirth.getTime());
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + format.format(dateOfBirth) +
                '}';
    }
}
