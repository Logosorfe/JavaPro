package com.telran.prof.lessonsbeforespring.lesson19.custom;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }
}
