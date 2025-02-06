package com.telran.prof.lessonsbeforespring.lesson25;

public class TestThread implements Runnable {


    @Override
    public void run() {
        System.out.println("Start thread " + Thread.currentThread().getName());
        long j = 0;
        boolean currentThreadHasBeenInterrupted = false;
        while (!currentThreadHasBeenInterrupted) {
            System.out.println("Current status interrupted  -  "
                    + Thread.currentThread().isInterrupted());
            for (int i = 0; i < 1000000000000L; i++) {
                j += i;

                try {
                    Thread.sleep(133);
                } catch (InterruptedException e) {
                    System.out.println("I got interruption. End thread");
                    //Когда поток прерывается во время выполнения метода Thread.sleep(133),
                    // выбрасывается исключение InterruptedException, и флаг прерывания потока сбрасывается
                    // (Переменная isInterrupted снова становится true).
                    // Это означает, что после выхода из блока try-catch метод
                    // Thread.currentThread().isInterrupted() вернет false, даже если поток был прерван.
                    // Поэтому ввел собственную переменную currentThreadHasBeenInterrupted.
                    currentThreadHasBeenInterrupted = true;
                    break;
                }
            }
        }
        System.out.println("End thread " + Thread.currentThread().getName());
    }
}
