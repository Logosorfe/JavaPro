package com.telran.prof.lessonsbeforespring.lesson11.queue.exampleone;

public class Student {

    private String name;

    private int rate = 0; /** Можно и не инициализировать, всё равно, при создании объекта,
 будет присвоен ноль */

    public Student(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
