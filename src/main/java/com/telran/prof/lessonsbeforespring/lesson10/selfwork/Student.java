package com.telran.prof.lessonsbeforespring.lesson10.selfwork;

public class Student {

    private String name;

    private int age;

    private Contact contact;

    public Student(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public boolean equals(Object obj) {
        //1
        if (this == obj) return true;
        //2
        if (obj == null) return false;
        //3
        if (!(obj instanceof Student)) return false;
        //4
        Student student = (Student) obj;

        return this.name.equals(student.name)
                && this.age == student.age
                && this.contact.equals(student.contact);
    }
}
