package com.telran.prof.lessonsbeforespring.lesson27;

import java.util.ArrayList;
import java.util.List;

public class ExampleThread {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        new Thread(new Consumer(strings)).start();
        new Thread(new Producer(strings)).start();
    }
}
