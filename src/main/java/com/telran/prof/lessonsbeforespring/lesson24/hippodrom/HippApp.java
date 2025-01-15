package com.telran.prof.lessonsbeforespring.lesson24.hippodrom;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HippApp {

    public static void main(String[] args) {
        int loopLength = 1000;
        Random random = new Random();
        String[] result = new String[4];

        List<Horse> horses = Arrays.asList(
                new Horse("Alex", random.nextInt(10) + 1, loopLength, (byte) 0, result),
                new Horse("Oleg", random.nextInt(10) + 1, loopLength, (byte) 1, result),
                new Horse("Egor", random.nextInt(10) + 1, loopLength, (byte) 3, result),
                new Horse("Max", random.nextInt(10) + 1, loopLength, (byte) 2, result)
        );
        System.out.println("Start : ");
        new Thread(new ResultPrinter(result)).start();
        for (Horse horse : horses) {
            new Thread(horse).start();
        }
    }
}
