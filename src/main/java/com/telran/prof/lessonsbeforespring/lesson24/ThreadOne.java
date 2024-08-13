package com.telran.prof.lessonsbeforespring.lesson24;

public class ThreadOne extends Thread {

    @Override
    public void run() {
        System.out.println("Sub thread "+Thread.currentThread().getName());
    }
}
