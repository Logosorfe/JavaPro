package com.telran.prof.lessonsbeforespring.lesson17;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ChangeOutExample {

    public static void main(String[] args) throws Exception {

        String path = "C:/Users/Logosorfe/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/files/out.txt";
        OutputStream fileOutputStream = new FileOutputStream(path);
        PrintStream printStream = new PrintStream(fileOutputStream);

        System.setOut(printStream);

        System.out.println("Hello");
        System.out.println("Class");

        fileOutputStream.close();/** забыли закрыть поток*/
        printStream.close();/** забыли закрыть поток*/
    }
}
