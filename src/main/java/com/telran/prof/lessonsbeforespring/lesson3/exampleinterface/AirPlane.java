package com.telran.prof.lessonsbeforespring.lesson3.exampleinterface;

public class AirPlane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane fly!");
    }
}