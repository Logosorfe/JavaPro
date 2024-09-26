package com.telran.prof.lessonsbeforespring.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegexAdvance {

    public static void main(String[] args) {
        String actual = "I1learned2about3Telran4College5and6now7I'm8studying9Java";
        String regex = "\\d"; // any digit from 0 to 9
        Matcher matcher = Pattern.compile(regex).matcher(actual);
        while (matcher.find()) {
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
        }
        String[] strings = actual.split(regex);
        for (String current : strings ) {
            System.out.print(current + "_");
        }
        System.out.println();

        for (String current : strings ) {
            System.out.print(current + " ");
        }

    }
}
