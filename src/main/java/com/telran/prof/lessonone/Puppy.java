package com.telran.prof.lessonone;

public class Puppy {
    //lowerCamelCase
    String name;

    int age;

    public Puppy() {
        // Этот метод - конструктор без параметров
        System.out.println("Hello call from constructor puppy class");
    }

    public Puppy(String namePuppy) {
        //Этот метод - конструктор с параметрами
        name = namePuppy;
    }

    public Puppy(String name, int age) {
        //Этот метод - конструктор с параметрами
        this.name = name;
        this.age = age;
    }
}