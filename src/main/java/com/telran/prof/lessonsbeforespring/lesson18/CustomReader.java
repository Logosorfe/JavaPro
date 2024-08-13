package com.telran.prof.lessonsbeforespring.lesson18;

public class CustomReader implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Hello from close from Custom reader");
    }
}