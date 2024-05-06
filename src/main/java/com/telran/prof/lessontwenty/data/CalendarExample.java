package com.telran.prof.lessontwenty.data;

import com.telran.prof.lessontwo.exthree.C;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        GregorianCalendar day = new GregorianCalendar(2021, Calendar.APRIL, 27);
        System.out.println(day);

        System.out.println(day.get(Calendar.MONTH));
        System.out.println(day.get(Calendar.YEAR));
        System.out.println(day.get(Calendar.DAY_OF_YEAR));
        System.out.println(day.get(6));

        day.set(2020, Calendar.MAY, 23);
        System.out.println(day);

        day.add(Calendar.MONTH,5);
        day.add(Calendar.DATE, 10);
        System.out.println(day);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = day.getTime();
        String formattedDate = formatter.format(date);
        System.out.println(formattedDate);

        formatter = new SimpleDateFormat("yyyy-MMMMM-dd HH:mm:ss");
        System.out.println(formatter.format(Calendar.getInstance().getTime()));
    }
}
