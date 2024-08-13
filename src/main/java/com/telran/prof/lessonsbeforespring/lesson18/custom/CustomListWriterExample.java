package com.telran.prof.lessonsbeforespring.lesson18.custom;


import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class CustomListWriterExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "SQL");
        String path = "C:/Users/logos/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessoneighteen/outout.txt";


        Writer customListWriter = new CustomListWriter(path);
        strings.stream().forEach(s -> {
            try {
                customListWriter.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
