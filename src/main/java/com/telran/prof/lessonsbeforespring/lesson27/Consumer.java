package com.telran.prof.lessonsbeforespring.lesson27;

import java.util.List;

public class Consumer extends Thread {

    private List<String> strings;

    public Consumer(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (strings) {
                if (strings.size() > 0) {
                    String s = strings.remove(0);/**Метод remove возвращает тот элемент, который был удален */
                    System.out.println("Object from list =" + s);
                    System.out.println("Size of list = " + strings.size());
                } else {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
