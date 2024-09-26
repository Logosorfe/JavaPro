package com.telran.prof.lessonsbeforespring.lesson17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedExample {

    public static void main(String[] args) throws Exception { // Так делать не нужно
        String pathToFile = "C:/Users/logos/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/file.txt";
        InputStream fileInputStream = new FileInputStream(pathToFile); // FNF

        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        fileInputStream.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);
        reader.close();/** забыли закрыть поток*/
    }
}
