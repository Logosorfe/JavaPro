package com.telran.prof.lessonsbeforespring.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {
        //LinkedList - связный список
        //в общем это однонаправленный связный список

        //В Java - класс LinkedList - это двунаправленный
        // связный список

        // ArrayList VS LinkedList
        // в массиве друг за другом, в связном списке элементы
        // в различных областях памяти

        List<String> listOne = new ArrayList<>();
        listOne.add("One"); //0
        listOne.add("Two"); //1
        listOne.add("Three"); //2
        //get(index) - O(1)
        System.out.println(listOne.get(1));

        List<String> listTwo = new LinkedList<>();
        listTwo.add("One");
        listTwo.add("Two");
        listTwo.add("Three");
        //get(index) - O(n)
        System.out.println(listTwo.get(1));

        //add(index, element) - O(n)
        // 1M - add by index 0 -> 1 element 999999
        listOne.add(0,"Four");

        //add(index, element) - O(1)
        // 1M - add by index 0 -> get ref to head ; new element ->head ->next -> oldhead
        listTwo.add(0,"Four");

    }
}
