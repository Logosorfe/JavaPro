package com.telran.prof.lessontwentysix.example;

import java.util.List;

public class WriterThread extends Thread {

    private List<String> strings;

    public WriterThread(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (strings) {
            for (int i = 0; i < 5; i++) {
                strings.add("_" + i);
                System.out.println("Thread " + name + " add value " + "_" + i);
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
