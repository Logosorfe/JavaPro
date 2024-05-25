package com.telran.prof.lessonfourteen;

public class UpperPrinter implements Printable {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
