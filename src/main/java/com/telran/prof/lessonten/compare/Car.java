package com.telran.prof.lessonten.compare;

public class Car {

    private int year;

    private String name;

    public Car(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
