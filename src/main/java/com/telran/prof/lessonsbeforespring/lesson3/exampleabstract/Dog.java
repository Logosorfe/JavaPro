package com.telran.prof.lessonsbeforespring.lesson3.exampleabstract;

public class Dog extends HomeAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void born() {
        System.out.println("Dog is born!");
    }

    @Override
    void humanCare() {
        System.out.println("Dog human care!");
    }
}
