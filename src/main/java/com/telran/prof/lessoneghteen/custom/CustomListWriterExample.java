package com.telran.prof.lessoneghteen.custom;


import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class CustomListWriterExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "SQL");
        String path = "";

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
