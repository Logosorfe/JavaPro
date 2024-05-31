package com.telran.prof.lessontwentysix;

import javax.print.attribute.standard.NumberOfInterveningJobs;

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
