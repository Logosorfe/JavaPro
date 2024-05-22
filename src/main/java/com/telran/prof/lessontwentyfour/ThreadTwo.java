package com.telran.prof.lessontwentyfour;

public class ThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("Sub thread "+Thread.currentThread().getName());
    }
}
