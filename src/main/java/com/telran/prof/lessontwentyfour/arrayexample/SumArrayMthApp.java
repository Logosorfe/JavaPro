package com.telran.prof.lessontwentyfour.arrayexample;

import java.util.Random;

public class SumArrayMthApp {

    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();
        for(int i = 0; i < 10000 ; i++) {
            array[i] = random.nextInt(200);
        }

        int[] result = new int[4];

    }
}
