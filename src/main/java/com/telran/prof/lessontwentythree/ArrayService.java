package com.telran.prof.lessontwentythree;

public class ArrayService {

    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IncorrectInputArrayException("Wrong input data in max method");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IncorrectInputArrayException("Wrong input data in min method");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
