package com.telran.prof.lessontwentyfour;

public class ThreadOne extends Thread {

    @Override
    public void run() {
        System.out.println("Sub thread "+Thread.currentThread().getName());
    }
}
