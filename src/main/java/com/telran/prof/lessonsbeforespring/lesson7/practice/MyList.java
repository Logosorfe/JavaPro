package com.telran.prof.lessonsbeforespring.lesson7.practice;

import java.util.Iterator;

public class MyList {

    private String[] elements;

    public MyList(String[] elements) {
        this.elements = elements;
    }

    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {

        int cursor;

        @Override
        public boolean hasNext() {
            return cursor < elements.length;
        }

        @Override
        public String next() {
            int i = cursor;
            cursor = i + 2;
            return elements[i];
        }
    }
}
