package com.telran.prof.lessonsbeforespring.lesson3.exampleinterface;

//interface - это полностью абстрактный класс
public interface Flyable {

    String FLY_NAME = "Name";

    void fly();

    default void prepareToFly() {
        System.out.println("Prepare to fly");
    }
}