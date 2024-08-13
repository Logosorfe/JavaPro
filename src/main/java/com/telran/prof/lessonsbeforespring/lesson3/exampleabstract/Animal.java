package com.telran.prof.lessonsbeforespring.lesson3.exampleabstract;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("animal eat!");
    }

    public String getName() {
        return name;
    }

    abstract void born();
}