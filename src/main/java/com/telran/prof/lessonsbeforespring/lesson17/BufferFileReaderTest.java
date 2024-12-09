package com.telran.prof.lessonsbeforespring.lesson17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferFileReaderTest {

    public static void main(String[] args) {
        String pathToFile = "C:/Users/Logosorfe/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/file.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathToFile); // FNF
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            reader.lines().forEach(line -> System.out.println(line));
            reader.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (Exception exception) {
            System.out.println("Problem with file " + exception.getMessage());
        }
    }

}