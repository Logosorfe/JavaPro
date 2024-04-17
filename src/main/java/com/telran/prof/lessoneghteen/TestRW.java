package com.telran.prof.lessoneghteen;

import com.telran.prof.lessontwo.exthree.B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestRW {

    public static void main(String[] args) {
        //Reader, Writer

        String pathIn = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessoneghteen/football.txt";
        String pathOut = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessoneghteen/outFootball.txt";
        try (FileReader reader = new FileReader(pathIn); FileWriter writer = new FileWriter(pathOut);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            while (bufferedReader.ready()) {
                String data = bufferedReader.readLine();
                writer.write(data + "\n");
            }

//             while (reader.ready()) {
//                 int data = reader.read();
//                 writer.write(data);
//             }
        } catch (IOException exception) {
            System.out.println("We have a problem " + exception.getMessage());
        }
    }
}
