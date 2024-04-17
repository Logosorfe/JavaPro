package com.telran.prof.lessoneghteen;

public class CustomReader implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Hello from close from Custom reader");
    }
}