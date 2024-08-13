package com.telran.prof.lessonsbeforespring.lesson19;

public class ExampleNine {

    public static void main(String[] args) {

        check(0);

        check(10);
    }

    private static void check(int n) {
        try {
            int x = 10 / n;
            int[] y = new int[n];
            y[n] = 10;
        } catch (Exception exception) {
            if (exception instanceof ArithmeticException) {
                System.out.println("Can't divide by zero");
            }
            if (exception instanceof IndexOutOfBoundsException) {
                System.out.println("Index does not exist");
            }
        }
    }

    // "Can't divide by zero" , "Index does not exist"
    // use one catch block for it
}
