package com.telran.prof.lessonnine;

import java.util.HashSet;
import java.util.Set;

public class TestExampleFive {

    public static void main(String[] args) {
        // add, remove, contains - O(1)
        Set<String> stringSet = new HashSet<>();
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("Hello");
        stringSet.add("World!");
        stringSet.add("World!");

        System.out.println(stringSet);

    }
}
