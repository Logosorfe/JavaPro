package com.telran.prof.lessonsbeforespring.lesson25;

public class ExampleThree {

    public static void main(String[] args) throws InterruptedException {
        Runnable one = () -> {
            while(true) {
                //
            }
        };

        Runnable two = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);

        System.out.println("State one is " + threadOne.getState());
        System.out.println("State two is " + threadTwo.getState());

        threadOne.setDaemon(true); /** Иначе процесс не заканчивается приходится останавливать вручную */
        threadOne.start();
        threadTwo.start();

        System.out.println("State one is " + threadOne.getState());
        System.out.println("State two is " + threadTwo.getState());

        Thread.sleep(12000);

        System.out.println("State one is " + threadOne.getState());
        System.out.println("State two is " + threadTwo.getState());
    }
}