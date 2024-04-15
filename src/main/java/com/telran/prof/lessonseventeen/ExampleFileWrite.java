package com.telran.prof.lessonseventeen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ExampleFileWrite {

    public static void main(String[] args) {
        String pathToFile = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessonseventeen/fileOut.txt";
        String text = "Hello from Java Class";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile);

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
