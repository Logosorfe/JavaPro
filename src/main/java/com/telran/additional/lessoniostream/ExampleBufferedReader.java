package com.telran.additional.lessoniostream;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExampleBufferedReader {

    public static void main(String[] args) {
        String pathFrom = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/ExampleFileInputStream.java";
        List<String> strings = new ArrayList<>();
        try {
            // BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(pathFrom)));
            InputStream inputStream = new FileInputStream(pathFrom);
            //InputStreamReader - convert bytes to char
            Reader reader = new InputStreamReader(inputStream);
            //Buffered - read use buffer
            BufferedReader bufferedReader = new BufferedReader(reader);

            while (bufferedReader.ready()) {
                strings.add(bufferedReader.readLine());
            }

        } catch (IOException exception) {
            System.out.println("Problem with file work " + exception.getMessage());
        }

        System.out.println("Count lines in file is " + strings.size());
    }
}
