package com.telran.prof.lessonsbeforespring.lesson17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ExampleFileWrite {

    public static void main(String[] args) {
        String pathToFile = "C:/Users/logos/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/fileOut.txt";
        String text = "Hello from Java Class";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile); /** при создании этого объекта будет создан или пересоздан
             пустой fileOut.txt */
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            for (byte temp : bytes) {
                fileOutputStream.write(temp);
            }
            fileOutputStream.close();

        } catch (FileNotFoundException exception) {
            System.out.println("Incorrect file path. Try again");
        } catch (IOException exception) {
            System.out.println("Error when access to file. Try again");
        }
    }
}
