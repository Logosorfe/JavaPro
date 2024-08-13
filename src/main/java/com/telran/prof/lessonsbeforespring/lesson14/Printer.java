package com.telran.prof.lessonsbeforespring.lesson14;

public class Printer implements Printable {

    @Override
    public void print(String text) {
        System.out.println("Hello " + text);
    }
}