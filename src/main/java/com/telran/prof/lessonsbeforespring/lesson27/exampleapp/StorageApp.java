package com.telran.prof.lessonsbeforespring.lesson27.exampleapp;

import java.util.concurrent.atomic.AtomicInteger;

public class StorageApp {

    public static AtomicInteger currentIndex  = new AtomicInteger();

    public static void main(String[] args) {
        Storage storage = new Storage();
        currentIndex.set(0);// Зачем он тут нужен, если он не принимает никакого участия в приложении?

        for (int i = 0; i < 10; i++) {
            new Thread(new Unloader(storage)).start();
        }
        new Thread(new Truck(storage)).start();
    }
}
