package com.telran.prof.lessontwentyfour;

public class MthExampleOne {

    public static void main(String[] args) {

        System.out.println("Main thread " + Thread.currentThread().getName());
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        //System.out.println();
        //SomeClass extends Thread
        //override run() method
        //написать внутри метода run() код который должен выполняться
        //create new object of SomeClass
        //call method start()

//        for(int i = 0; i < 10 ; i++) {
//            new ThreadOne().start();
//        }

        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();
        new ThreadOne().start();

    }
}
