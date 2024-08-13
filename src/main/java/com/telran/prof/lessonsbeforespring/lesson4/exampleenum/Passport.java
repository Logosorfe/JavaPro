package com.telran.prof.lessonsbeforespring.lesson4.exampleenum;

public class Passport {

    private PassportType passportType;

    public Passport(PassportType passportType) {
        this.passportType = passportType;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportType=" + passportType +
                '}';
    }
}
