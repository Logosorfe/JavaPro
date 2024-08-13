package com.telran.prof.lessonsbeforespring.lesson24;

public class MthExampleFour {

    public static void main(String[] args) throws InterruptedException {
       // Thread.sleep(5000);
        System.out.println("Start method main in thread " + Thread.currentThread().getName());

        //new ThreadFour().run();
        new Thread(new ThreadFour()).start();

        System.out.println("End method main in thread " + Thread.currentThread().getName());
    }
}
