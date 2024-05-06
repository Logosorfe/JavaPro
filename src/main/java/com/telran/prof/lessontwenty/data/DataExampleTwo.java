package com.telran.prof.lessontwenty.data;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DataExampleTwo {

    public static void main(String[] args) {
        Locale locale = new Locale("de");
        Date date = new Date();
        String format = String.format(locale,"%tc\n", date) +
                String.format(locale, "%tD\n", date) +
                String.format(locale, "%tF\n", date) +
                String.format(locale, "%tr\n", date) +
                String.format(locale, "%tz\n", date) +
                String.format(locale, "%tZ\n", date);
        System.out.println(format);

        String birthday = String.format("My birthday is %d year , %d month, %d day",1900, 10 , 10);
        System.out.println(birthday);
    }
}
