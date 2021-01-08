package com.pavlova.homeworks.lecture09;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(80, 05, 20);
        Date issueDate = new Date(120, 05, 20);
        Book book = new Book(new Author("Nik", "Li", date), issueDate, Genre.COMEDY, 12569474952L);
        System.out.println(book);
    }
}
