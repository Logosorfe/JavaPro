package com.telran.additional.lessoniostream;

import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ExampleIOStream {

    public static void main(String[] args) {
        //OutputStream, InputStream - byte stream   (read, write , available)
        //Reader, Writer - char stream  (read, write , available)

        //System.out  - OutputStream - standard stream for output
        System.out.println("Hello");
        PrintStream out = System.out;
        out.println("Hello again");
        System.out.println("");
        System.out.print("");
        System.out.printf("");

        int x = 100;
        System.out.printf("Print integer x  = %d\n", x);
        float y = 3.14f;
        float pi = (float) Math.PI;
        System.out.printf("Formatted float y = %.6f\n", pi);

        Date date = new Date();
        System.out.println(date);
        System.out.printf("Hours %tH : minutes %tM : seconds %tS \n", date, date, date);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        //System.in - InputStream - standard stream for input
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);

        //System.err - stream for error
        PrintStream err = System.err;
        err.println("Hello error");
    }
}
