package com.telran.prof.lessonsbeforespring.lesson24;

public class MthExampleFive {

    public static void main(String[] args)  {
        System.out.println("Start main thread");

        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Start sub thread " + name);
            for (int i = 0; i < 10; i++) {
                System.out.println("Run in sub thread " + name + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("End sub thread " + name);
        };

        new Thread(runnable).start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End main thread");
    }
}
