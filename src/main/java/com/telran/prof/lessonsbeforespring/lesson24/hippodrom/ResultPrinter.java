package com.telran.prof.lessonsbeforespring.lesson24.hippodrom;

import java.util.Arrays;

public class ResultPrinter implements Runnable{

    private String[] result;

    public ResultPrinter(String[] result) {
        this.result = result;
    }
    @Override
    public void run() {
        boolean isDone = false;
        while (!isDone) {
            isDone = true;
            for (String resultString : result) {
                if (resultString == null) {
                    isDone = false;
                }
            }
        }
        System.out.println();
        for (String res : result) System.out.println(res);
    }
}