package com.telran.prof.lessoneighteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleTryWR {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessoneghteen/football.txt";
        // try - with - resources
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
