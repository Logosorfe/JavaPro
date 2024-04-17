package com.telran.prof.lessoneghteen.custom;


import java.util.Arrays;
import java.util.List;

public class CustomListWriterExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "SQL");
        String path = "";

        CustomListWriter customListWriter = new CustomListWriter();
        customListWriter.write(strings, path);
    }
}
