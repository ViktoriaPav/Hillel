package com.pavlova.homeworks.lecture08;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public final class Book  {
    private final Author author;
    private final Date issueDate;
    private final Genre genre;
    private final Long isbn;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");

    public Book(Author author, Date issueDate, Genre genre, Long isbn) {
        this.author =  author;
        this.issueDate = new Date(issueDate.getTime());
        this.genre = genre;
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public Date getIssueDate() {
        return new Date(issueDate.getTime());
    }

    public Genre getGenre() {
        return genre;
    }

    public Long getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;

            return Objects.equals(getAuthor(), book.getAuthor()) &&
                    Objects.equals(getIssueDate(), book.getIssueDate()) &&
                    getGenre() == book.getGenre() &&
                    Objects.equals(getIsbn(), book.getIsbn());
    }

    @SneakyThrows
    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getIssueDate(), getGenre(), getIsbn());
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
