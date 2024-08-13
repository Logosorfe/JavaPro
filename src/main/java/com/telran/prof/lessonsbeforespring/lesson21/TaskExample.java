package com.telran.prof.lessonsbeforespring.lesson21;

import java.time.*;

public class TaskExample {

    public static void main(String[] args) {
        //1)check that date 10 Jan 1985 is Friday
        //2)minus 10 years and print to console
        //3)Create ZoneDateTime at 01.01.1980 20-00-00 Pacific/Midway
        LocalDate date = LocalDate.of(1985, 1, 10);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        //1
        System.out.println("Is Friday " + (DayOfWeek.FRIDAY == dayOfWeek));

        //2
        System.out.println(date.minusYears(10));

        //3
        ZonedDateTime zone = ZonedDateTime.of(LocalDateTime.of(1980, 1, 1, 20, 00, 00),
                ZoneId.of("Pacific/Midway"));
        System.out.println(zone);
    }
}
