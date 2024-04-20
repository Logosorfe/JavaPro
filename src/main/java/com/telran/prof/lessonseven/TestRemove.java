package com.telran.prof.lessonseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemove {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Elements :" + list);
//Does not work
//        for(Integer element : list) {
//            if(element % 2 != 0) {
//                list.remove(element);
//            }
//        }
//Does not work
//        for(int i = 0; i < 10 ; i++) {
//            if(list.get(i) % 2 != 0) {
//                list.remove(i);
//            }
//        }
    // Work but comment !!!!
    //        for (int i = 0; i < list.size(); i++) {
    //            if (list.get(i) % 2 != 0) {
    //                list.remove(i);
    //            }
    //        }
    //    System.out.println(list);
        /** На самом деле последний метод будет работать не верно, он будет перепрыгивать значения
        Можно проверить если создать список из одних нечётных цифр */

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            System.out.print(" " + current);
            if(current % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(list);

    }
}
