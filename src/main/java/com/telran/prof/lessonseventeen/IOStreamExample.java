package com.telran.prof.lessonseventeen;

import com.telran.prof.lessontwo.exthree.D;

import java.io.OutputStream;
import java.util.Date;

public class IOStreamExample {

    public static void main(String[] args) {
        //OutputStream, InputStream - byte stream
        //Reader, Writer - char stream

        OutputStream out = System.out;
        System.out.println("Hello!");
        System.out.print("helloheloo");

        int x = 100;
        System.out.printf("Print format integer : x = " + x + ";\n");
        System.out.printf("Print format integer : x = %d;\n", x);

        System.out.printf("Format PI = %.2f\n", Math.PI);
        float y = 12343423.3f;
        System.out.printf("Format PI = %50.4f\n", y);

        Date date = new Date();
        System.out.println(date);
        System.out.printf("%tT%n", date);

    }
}
