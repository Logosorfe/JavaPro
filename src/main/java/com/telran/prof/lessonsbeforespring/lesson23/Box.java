package com.telran.prof.lessonsbeforespring.lesson23;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private List<String> stringList;

    public Box() {
        stringList = new ArrayList<>();
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void addStringToList(String str) {
        stringList.add(str);
    }
}
