package com.telran.prof.lessonsbeforespring.lesson4.exampleenum;

public class StaticExample {

    public static String hello = "Hello";

    public static void main(String[] args) {
        StaticExample exampleOne = new StaticExample();
        System.out.println(exampleOne.hello);

        StaticExample exampleTwo = new StaticExample();
        System.out.println(exampleTwo.hello);

        exampleOne.hello = "Hi";

        System.out.println(exampleOne.hello);
        System.out.println(exampleTwo.hello);

        StaticExample exampleThree = new StaticExample();
        System.out.println(exampleThree.hello);

        System.out.println(hello);
    }
}
