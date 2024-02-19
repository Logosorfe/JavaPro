package com.telran.prof.lessonthree.exampleinterface;

public class AirPlane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane fly!");
    }
}