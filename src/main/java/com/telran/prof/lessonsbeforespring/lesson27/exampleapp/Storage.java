package com.telran.prof.lessonsbeforespring.lesson27.exampleapp;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Box> boxes = new ArrayList<>();
// Какой смысл в гетере и сетере если список публичный, исправил на private
    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}
