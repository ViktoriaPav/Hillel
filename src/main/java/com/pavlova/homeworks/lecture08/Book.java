package com.pavlova.homeworks.lecture08;

import java.util.Date;
import java.util.Objects;

public final class Book {
    private final Author author;
    private final Date issueDate;
    private final Genre genre;

    public Book(Author author, Date issueDate, Genre genre) {
        this.author = author;
        this.issueDate = issueDate;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(issueDate, book.issueDate) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, issueDate, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", issueDate=" + issueDate +
                ", genre=" + genre +
                '}';
    }
}
