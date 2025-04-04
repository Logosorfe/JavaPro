package com.telran.prof.lessonsbeforespring.lesson27;

import java.time.LocalTime;
import java.util.List;

public class Producer extends Thread {

    private List<String> strings;

    public Producer(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        while (true) {
            sleepNow(2000);
            synchronized (strings) {
                strings.add("Hello World " + LocalTime.now());
                strings.notify();
            }
        }
    }

    private void sleepNow(long ms) {
        try {
            sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
