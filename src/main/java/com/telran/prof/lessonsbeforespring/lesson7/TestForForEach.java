package com.telran.prof.lessonsbeforespring.lesson7;

import java.util.Arrays;
import java.util.List;

public class TestForForEach {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A",
                "B", "C", "D", "E");
        for (String value : list) {
            System.out.println("" + value);
        }

        list.forEach(value -> {
            System.out.println(" " + value);
        });

        //
        long startTime = System.currentTimeMillis();
        for (String value : list) {
            System.out.println("" + value);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to execute is :" + (endTime - startTime));
    }
}
