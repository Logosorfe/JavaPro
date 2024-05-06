package com.telran.prof.lessontwentyone.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();

        List list = new ArrayList();
        list.add("I like ");
        //Object o = list.get(0);
        String text  = (String) list.get(0); // + " generics !";
        System.out.println(text);

        List listOne = new ArrayList();
        listOne.add("Java ");
        listOne.add(1);
        for (Object str : listOne) {
            System.out.println((String) str);
        }
    }
}
