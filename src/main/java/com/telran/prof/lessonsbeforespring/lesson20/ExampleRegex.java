package com.telran.prof.lessonsbeforespring.lesson20;

import java.util.regex.Pattern;

public class ExampleRegex {

    public static void main(String[] args) {
        String regex = ".*www.*"; /** '.*' обозначает что перед и после регулярного выражения могут быть другие символы
         Без этого, регулярное выражение будет искать строку, которая начинается с или заканчивается на “www”*/
        String actual = "www.telran.de";

        Pattern pattern = Pattern.compile(regex);
        boolean matches = pattern.matcher(actual).matches();
        System.out.println("Actual string contains REGEX(" + regex + ") = " + matches);

        boolean result = Pattern.matches(regex, actual);
        System.out.println("Actual contains = " + result);
    }
}
