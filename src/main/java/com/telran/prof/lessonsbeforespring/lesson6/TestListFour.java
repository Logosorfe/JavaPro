package com.telran.prof.lessonsbeforespring.lesson6;

import java.util.ArrayList;
import java.util.List;

public class TestListFour {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        List<String> list = new ArrayList<>();
        TestListFour testListFour = new TestListFour();
        testListFour.addElementsInReverseOrder(list);
    }

    private void addElementsInReverseOrder(List<String> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, "" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to execute = " + (endTime - startTime));
    }
}
