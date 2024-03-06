package com.telran.prof.lessonseven.practice;

import java.util.Iterator;

public class TestMyListIterator {

    public static void main(String[] args) {
        MyList list = new MyList(new String[]{"One","Four","Two","Five","Three","Six",
        "Seven"});

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        // One, Two, Three
        String next = iterator.next();
    }
}
