package com.telran.prof.lessonsbeforespring.lesson26;

public class CustomSyncApp {

    public static void main(String[] args) {
        Object monitor = new Object();
        Object o = new Object();

        CustomSync customSyncOne = new CustomSync(monitor);
        CustomSync customSyncTwo = new CustomSync(o);

        Thread threadOne = new Thread(customSyncOne);
        Thread threadTwo = new Thread(customSyncTwo);

        threadOne.start();
        threadTwo.start();

    }
}
