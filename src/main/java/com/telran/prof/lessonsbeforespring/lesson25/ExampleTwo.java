package com.telran.prof.lessonsbeforespring.lesson25;

public class ExampleTwo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main thread");

        Thread thread = new Thread(new TestThread());
        thread.start();

        Thread.sleep(10000);

        thread.interrupt();  // Running - isInterrupted
                             // sleep, wait - try-catch
    }
}
