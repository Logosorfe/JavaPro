package com.telran.prof.lessonseven.practice;

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

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return null;
        }
    }
}
