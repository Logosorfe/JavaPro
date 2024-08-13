package com.telran.prof.lessonsbeforespring.lesson2.exfour;

public class Phone {

    private String name;

    public void call() {
        System.out.println("Call from phone with name " + name);
    }

    public void receiveCall() {
        System.out.println("Get call");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }
}
