package com.telran.prof.lessonsbeforespring.lesson22;

public class OnlyNumberApp {

    public static void main(String[] args) {
        OnlyNumber<Integer,Integer> integerOnlyNumber = new OnlyNumber<>(5,5);
        OnlyNumber<Integer, Double> stringOnlyNumber = new OnlyNumber<>(5,2.3);
    }
}
