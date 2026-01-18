package com.telran.prof.lessonsbeforespring.lesson26.incorrect;

import static com.telran.prof.lessonsbeforespring.lesson26.incorrect.MthExampleIncorrect.counter;
/** Ошибка была в том что сослались на counter в классе предыдущего урока - lesson25.ExampleFour.counter;*/
public class Runner implements Runnable {

    @Override
    // public synchronized void run() // - можно в сигнатуре метода
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 0; i < 1000; i++) {
            //1 get
            //2 increase 1
            //3 set

            synchronized (this) {
                System.out.println("Thread " + name + " " + counter++);
            }


            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

