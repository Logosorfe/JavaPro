package com.telran.prof.springlessons.lesson33.bookshelf.model;

public class Book {

    private final String title;

    private String isbn;

    private final int yearOfPublishing;

    public Book(String title, String isbn, int yearOfPublishing) {
        this.title = title;
        this.isbn = isbn;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(String title, int year) {
        this.title = title;
        this.yearOfPublishing = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}
