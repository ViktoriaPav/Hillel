package com.pavlova.homeworks.lecture09;

import lombok.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Value
public class Book {
    private Author author;
    private Date issueDate;
    private Genre genre;
    private Long isbn;
    @Getter(AccessLevel.NONE)
    private SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");

    public Book(Author author, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.issueDate = new Date(issueDate.getTime());
        this.genre = genre;
        this.isbn = isbn;
    }

    public Date getIssueDate() {
        return new Date(issueDate.getTime());
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", issueDate=" + format.format(issueDate) +
                ", genre=" + genre +
                ", isbn=" + isbn +
                '}';
    }
}
