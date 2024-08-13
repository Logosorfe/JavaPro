package com.telran.prof.lessonsbeforespring.lesson5;

public class TestArrayTwo {

    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[][] arrayTwo = {{5, 6, 7}, {8, 9, 10}, {11, 12, 13}};

        printArray(arrayTwo);
        int[][] arrayThree = {{5, 6, 7, 8}, {1, 2}, {4, 5, 6, 7, 9, 9}};
        System.out.println();
        printArray(arrayThree);
        System.out.println();
        int[][] arrayFour = new int[3][];
        printArray(arrayFour);
        int[][] arraySix = {{5, 6, 7, 8}, null, {4, 5, 6, 7, 9, 9}};
        printArray(arraySix);
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    private static void printArrayTwo(int[][] arrayTwo) {
        for (int[] ints : arrayTwo) {
            if (ints != null) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        }
    }
}
