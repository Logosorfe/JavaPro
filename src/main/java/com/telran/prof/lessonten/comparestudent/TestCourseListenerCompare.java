package com.telran.prof.lessonten.comparestudent;

import com.telran.prof.lessontwo.exthree.C;

import java.util.*;

public class TestCourseListenerCompare {

    public static void main(String[] args) {
        List<CourseListener> courseListeners = Arrays.asList(
                new CourseListener("Alex", 5),
                new CourseListener("Maxim", 3),
                new CourseListener("Oleg", 6)
        );
        System.out.println(courseListeners);
        Collections.sort(courseListeners);
        System.out.println(courseListeners);

        Set<CourseListener> set = new TreeSet<>();
        set.add(new CourseListener("Alex", 5));
        set.add(new CourseListener("Maxim", 3));
        System.out.println(set);
    }
}
