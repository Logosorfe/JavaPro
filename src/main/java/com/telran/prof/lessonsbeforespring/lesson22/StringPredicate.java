package com.telran.prof.lessonsbeforespring.lesson22;

import java.util.function.Predicate;

public class StringPredicate<T> implements Predicate<T> {

    @Override
    public boolean test(T integer) {
        return false;
    }
}
