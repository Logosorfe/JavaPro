package com.telran.prof.lessonsbeforespring.lesson24.hippodrom;

import java.time.LocalTime;

public class Horse implements Runnable {

    private final String name;

    private final int step;

    private final int loopLength;

    private int currentPosition;

    private final byte index;

    private final String[] result;

    public Horse(String name, int step, int loopLength, byte index, String[] result) {
        this.name = name;
        this.step = step;//Поменял в исполнительном классе HippApp на random.nextInt(10) + 1, чтобы можно было сделать тест
        this.loopLength = loopLength;
        this.index = index;
        this.result = result;
    }

    @Override
    public void run() { //Сделал тест на данный метод
        while (currentPosition < loopLength) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentPosition += step;
            System.out.println("Horse " + name + " step by " + currentPosition);
        }
        result[index] = ("I am " + name + " finish time " + LocalTime.now());
    }
}
