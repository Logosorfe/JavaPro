package com.telran.prof.lessonsbeforespring.lesson21.generics;

public class GenericTestApp {

    public static void main(String[] args) {
        TestString one = new TestString("Hello");
        String objOne = one.getObj();

        TestInteger two = new TestInteger(5);
        Integer objTwo = two.getObj();

        Test<String> three = new Test<>("Hello");
        String objThree = three.getObj();
        System.out.println(objThree);

        Test<Double> four = new Test<>(5.5);
        Double objFour = four.getObj();
        System.out.println(objFour);

        TestTwo<String, Integer> testTwo =  new TestTwo<>("Hello", 10);
        testTwo.print();
    }
}
