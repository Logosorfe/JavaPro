package com.telran.prof.lessoneleven.queue.exampleone;

import java.util.Comparator;

public class RateComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o2.getRate() - o1.getRate());/** Просто поменял местами и сортировка будет
         по убыванию */
    }
}
