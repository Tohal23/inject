package org.example.inject.dto.impl;

import java.io.Serializable;

public class Book extends AbstractPeriodic implements Serializable {

    private String author;

    public Book(boolean periodic, String name, String author) {
        super(periodic, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
