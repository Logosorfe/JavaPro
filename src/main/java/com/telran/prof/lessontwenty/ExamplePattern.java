package com.telran.prof.lessontwenty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamplePattern {

    public static void main(String[] args) {
        String actual = "I learned about Telran College and now I'm studying Java";
        String regex = "i";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(actual);
        while (matcher.find()) {
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
        }
    }
}
