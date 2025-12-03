package com.telran.prof.lessonsbeforespring.lesson17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleFileRead {

    public static void main(String[] args) {
        //try {
        // zdes moget byt problema
        // } catch (Exception e) {
        // handle exception
        // }

        String pathToFile = "C:/Users/Logosorfe/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/file.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathToFile); // FNF

            while (fileInputStream.available() > 0) { //IO
                int read = fileInputStream.read(); //IO
                System.out.print("" + (char) read);
            }

            fileInputStream.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Incorrect file path. Try again");
        } catch (IOException exception) {
            System.out.println("Error when access to file. Try again");
        }


        System.out.println();
        System.out.println("End of application");
    }
}
