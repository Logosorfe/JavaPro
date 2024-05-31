package com.telran.prof.lessontwentysix;

public class TestSync {

    public static void main(String[] args) throws InterruptedException {
        SyncImpl sync = new SyncImpl();

        Thread threadOne = new Thread(sync);
        Thread threadTwo = new Thread(sync);

        threadOne.start();

        Thread.sleep(1000); // main

        threadTwo.start();

        Thread.sleep(2000); // main
        System.out.println("State for thread one = " + threadOne.getState());
        System.out.println("State for thread two = " + threadTwo.getState());

    }
}
