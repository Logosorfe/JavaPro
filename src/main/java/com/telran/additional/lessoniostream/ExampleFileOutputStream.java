package com.telran.additional.lessoniostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;

public class ExampleFileOutputStream {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/fileOut.txt";
        String text = "Text to file";
        String text2= "Данные для файла";
        try {
            OutputStream outputStream = new FileOutputStream(path);
            char[] chars = text2.toCharArray();
            for (char temp : chars) {
                outputStream.write(temp);
            }
            outputStream.close();
        } catch (IOException exception) {
            System.out.println("We have some problem with file " + exception.getMessage());
        }
    }
}
