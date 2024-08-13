package com.telran.prof.lessonsbeforespring.lesson26.loadapp;

import java.util.List;

public class Loader implements Runnable {

    List<String> list;

    public Loader(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            sleep(1000);

            synchronized (list) {
                for (int i = 0; i < 10; i++) {
                    list.add("_" + i);
                    System.out.println("Thread " + name + " add value " + "_" + i);
                    sleep(1000);
                }
            }
        }
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
