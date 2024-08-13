package com.telran.prof.lessonsbeforespring.lesson24;

public class ThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("Sub thread "+Thread.currentThread().getName());
    }
}
