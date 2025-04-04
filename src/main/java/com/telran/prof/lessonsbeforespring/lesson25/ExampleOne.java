package com.telran.prof.lessonsbeforespring.lesson25;

public class ExampleOne {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main thread");

        Thread thread = new Thread(new Printer());
        thread.setDaemon(true);
        thread.start();

        //thread.stop(); !! incorrect

        Thread.sleep(5000);
        System.out.println("End main thread");
    }
}
