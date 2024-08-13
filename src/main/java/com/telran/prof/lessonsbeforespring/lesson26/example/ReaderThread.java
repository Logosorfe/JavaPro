package com.telran.prof.lessonsbeforespring.lesson26.example;

import java.util.List;

public class ReaderThread extends Thread {

    private List<String> strings;

    public ReaderThread(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (strings) {
            for (String str : strings) {
                System.out.println("Thread " + name + " read value " + str);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
