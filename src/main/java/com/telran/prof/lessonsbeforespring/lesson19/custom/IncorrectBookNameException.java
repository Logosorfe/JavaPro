package com.telran.prof.lessonsbeforespring.lesson19.custom;

public class IncorrectBookNameException extends RuntimeException {

    public IncorrectBookNameException(String message) {
        super(message);
    }
}
