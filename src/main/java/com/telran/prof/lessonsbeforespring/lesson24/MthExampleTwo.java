package com.telran.prof.lessonsbeforespring.lesson24;

public class MthExampleTwo {

    public static void main(String[] args) {
        System.out.println("Main thread " + Thread.currentThread().getName());

        ThreadTwo threadTwo = new ThreadTwo();
        Thread thread = new Thread(threadTwo);
        thread.start();
    }
}
