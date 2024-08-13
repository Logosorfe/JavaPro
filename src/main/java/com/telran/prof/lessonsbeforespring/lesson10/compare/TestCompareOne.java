package com.telran.prof.lessonsbeforespring.lesson10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCompareOne {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 6, 3, 6, 8, 2, 4, 7);
        System.out.println("List before sort " + integerList);
        Collections.sort(integerList);
        System.out.println("List after sort " + integerList);
    }
}
