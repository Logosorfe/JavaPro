package com.telran.prof.lessonfive;

public class TestNpe {

    public static void main(String[] args) {
        String hello = "Hello";
        chekString(hello);

        chekString(null);
    }

    private static void chekString(String str) {
        if ("Hello".equals(str)) {
            System.out.println("Hello! Hello!");
        }
    }
}
