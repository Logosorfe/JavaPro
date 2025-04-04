package com.telran.prof.lessonsbeforespring.lesson17;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Scanner;

public class IOStreamExample {

    public static void main(String[] args) {
        //OutputStream, InputStream - byte stream
        //Reader, Writer - char stream

        //System.out
        OutputStream out = System.out;
        System.out.println("Hello!");
        System.out.print("helloheloo");
        System.out.println();

        int x = 100;
        System.out.print("Print format integer : x = " + x + ";\n");
        System.out.printf("Print format integer : x = %d;\n", x);

        System.out.printf("Format PI = %.2f\n", Math.PI);
        float y = 12343423.3f;
        System.out.printf("Format PI = %50.4f\n", y);

        Date date = new Date();
        System.out.println(date);
        System.out.printf("%tT%n", date);

        //System.in
        Scanner scanner = new Scanner(System.in);
        InputStream in = System.in;
        scanner.close();/** забыли закрыть поток*/

        //System.err

        System.err.println("Hello world!");
    }
}
