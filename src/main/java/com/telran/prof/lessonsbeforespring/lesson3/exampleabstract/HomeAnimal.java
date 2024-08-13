package com.telran.prof.lessonsbeforespring.lesson3.exampleabstract;

public abstract class HomeAnimal extends Animal {

    public HomeAnimal(String name) {
        super(name);
        // super() -  call parent constructor
        // this() - call current constructor
    }

    abstract void humanCare();
}
