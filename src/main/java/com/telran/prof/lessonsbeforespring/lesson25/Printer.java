package com.telran.prof.lessonsbeforespring.lesson25;

public class Printer implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("" + Thread.currentThread().getName() + " " + i);
            i++;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
