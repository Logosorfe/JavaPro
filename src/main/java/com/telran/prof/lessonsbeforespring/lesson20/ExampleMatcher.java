package com.telran.prof.lessonsbeforespring.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleMatcher {

    public static void main(String[] args) {
        String regex = "tel"; //email
        String actual = "www.telran.de.tel.com"; //text

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actual);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end() - 1;
            System.out.println("Pattern found from " + start + " to " + end);
        }
    }
}
