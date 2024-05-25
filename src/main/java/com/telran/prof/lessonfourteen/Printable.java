package com.telran.prof.lessonfourteen;

@FunctionalInterface
public interface Printable {

    void print(String text);

    //String getHello();

    default void printHello() {
        System.out.println("printHello");
    }

    static void printHelloTwo() {
        System.out.println("printHelloTwo");
    }
}