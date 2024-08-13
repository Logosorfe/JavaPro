package com.telran.prof.lessonsbeforespring.lesson21;

import java.time.*;
import java.util.Set;

public class ZoneExample {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime parse = ZonedDateTime.parse("2024-05-06T21:05:06.412367+03:00[Europe/Moscow]");
        System.out.println(parse);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for(String zone : availableZoneIds) {
            System.out.println(zone);
        }

        ZonedDateTime of = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Asia/Yerevan"));
        ZonedDateTime of1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Pacific/Guadalcanal"));
        System.out.println(of);
        System.out.println(of1);
    }
}
