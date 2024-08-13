package com.telran.prof.lessonsbeforespring.lesson14;

public interface CustomFunctionalInt {

    void accept();

    default void print() {
        System.out.println("Hello");
    }

    static void printTwo() {
        System.out.println("HelloTwo");
    }
}
