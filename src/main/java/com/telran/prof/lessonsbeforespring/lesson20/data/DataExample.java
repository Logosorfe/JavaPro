package com.telran.prof.lessonsbeforespring.lesson20.data;

import java.util.Date;

public class DataExample {

    public static void main(String[] args) {
        // 1 Jan 1970 03-00

        Date dateOne = new Date();  // current date
        System.out.println("Date one " + dateOne);
        System.out.println(dateOne.getTime());

        Date dateTwo = new Date(1712416717290L);
        System.out.println("Date two " + dateTwo);

        Date dateThree = new Date(2021 - 1900, 04, 14);
        System.out.println(dateThree);

        System.out.println("Date two comes after date one " + dateTwo.after(dateOne));
        System.out.println("Date two comes before date one " + dateTwo.before(dateOne));
        System.out.println("Date two compare date one " + dateTwo.compareTo(dateOne));

        System.out.println("Mills from 01 Jan 1970 to date one is " + dateOne.getTime());
    }
}
