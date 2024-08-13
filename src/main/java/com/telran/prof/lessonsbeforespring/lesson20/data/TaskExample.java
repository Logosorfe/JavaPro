package com.telran.prof.lessonsbeforespring.lesson20.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TaskExample {

    public static void main(String[] args) {
        //1. Use Calendar - check that year is leap (in separate method)
        //2. Localize data for India
        //3. Print date in format : 19-12-22, 19, 353, 15:44

        //1
        System.out.println("This year is leap year = " + isLeap(2024));

        //2
        Locale locale = new Locale("in");
        System.out.println(String.format(locale,"%tc", new Date()));

        //3
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy, dd, D, k:m");
        System.out.println(simpleDateFormat.format(date));


    }

    private static boolean isLeap(int year) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        return gregorianCalendar.isLeapYear(year);
    }
}
