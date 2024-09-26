package com.telran.prof.lessonsbeforespring.lesson18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleTryWR {

    public static void main(String[] args) {
        String path = "C:/Users/logos/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson18/football.txt";
        // try - with - resources
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
