package com.telran.prof.lessonten.compare;

import java.util.Comparator;

public class SortByName implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int result = o1.getName().compareTo(o2.getName());
        return result;
    }
}
