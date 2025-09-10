package com.telran.prof.lessonsbeforespring.lesson9;

import java.util.Set;
import java.util.TreeSet;

public class TestExampleFour {

    public static void main(String[] args) {
        //Does not work without Comparable!
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Alex"));
        people.add(new Person("Oleg"));
        System.out.println(people);
    }
}
