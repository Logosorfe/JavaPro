package com.telran.prof.lessonsix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListFive {

    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        listOne.add("RED");
        listOne.add("WHITE");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("YELLOW");
        listTwo.add("BLACK");
        listTwo.add("RED");

        listOne.addAll(listTwo);
        System.out.println(listOne);

        System.out.println("Is empty  = " + listOne.isEmpty());

        List<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.WHITE);

        List<String> stringList = Arrays.asList("RED","White","RED");
        System.out.println(stringList);

        //List<String> red = List.of("RED", "WHITE");
    }
}
