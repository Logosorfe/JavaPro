package com.telran.prof.lessonsbeforespring.lesson27.exampleapp;

public class Box {

    private int id;

    public Box(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Box id =" + id;
    }
}
