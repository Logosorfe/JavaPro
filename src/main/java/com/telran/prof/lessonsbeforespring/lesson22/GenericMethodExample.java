package com.telran.prof.lessonsbeforespring.lesson22;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GenericMethodExample {

    public static void main(String[] args) {
        printElementClassName("Hello");
        printElementClassName(10);

        System.out.println(getElement("Hello","Java"));
        System.out.println(getElement(10,"Java"));
        System.out.println(getElement(new ArrayList<>(),"Java"));

        Predicate<String> stringPredicate = str -> str.isEmpty();
        boolean strTest = stringPredicate.test("");

        Predicate<Integer> integerPredicate = integer -> integer > 10;
        boolean intTest = integerPredicate.test(5);

    }

    private static <T> void printElementClassName(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    private static <T> T getElement(T element, String elementTwo) {
       // T[] element2 = new Object[]; incorrect
        return element;
    }

//    private static void printElementClassName(String element) {
//        System.out.println(element.getClass().getName() + " = " + element);
//    }
//
//    private static void printElementClassName(Integer element) {
//        System.out.println(element.getClass().getName() + " = " + element);
//    }
}
