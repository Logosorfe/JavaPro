package com.telran.prof.lessonsbeforespring.lesson25;

public class TestCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            ExampleFour.counter++; // 1.get counter , 2.counter + 1, 3. counter =
            //Thread Thread-0 242 // 1.get counter       // 242
            //Thread Thread-2 242 // 1.get counter , 2.counter  // 242
            //Thread Thread-1 242 // //242
            ExampleFour.counterTwo.getAndIncrement();
            System.out.println("Thread " + Thread.currentThread().getName() + " " +
                    ExampleFour.counter);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ExampleFour.list.add(i);
        }
    }
}
