package com.telran.prof.lessonfour.datatype;

public class PersonExample {

    public static void main(String[] args) {
        Person alex = new Person("Alex");
        System.out.println("Person before " + alex);

        changePersonName(alex);

        System.out.println("Person after " + alex);
        alex = null;
        System.out.println(alex);
    }

    private static void changePersonName(Person maxim) {
        maxim.setName("Maxim");
    }
}
