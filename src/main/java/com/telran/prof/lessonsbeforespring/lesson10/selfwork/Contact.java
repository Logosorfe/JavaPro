package com.telran.prof.lessonsbeforespring.lesson10.selfwork;

public class Contact {

    private String street;

    private int home;

    public Contact(String street, int home) {
        this.street = street;
        this.home = home;
    }

    public boolean equals(Object obj) {
        //1
        if (this == obj) return true;
        //2
        if (obj == null) return false;
        //3
        if (!(obj instanceof Contact)) return false;
        //4
        Contact contact = (Contact) obj;

        return this.street.equals(contact.street) && this.home == contact.home;
    }
}
