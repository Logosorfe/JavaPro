package com.telran.prof.lessonsbeforespring.lesson20;

import java.util.regex.Pattern;

public class ExampleRegex {

    public static void main(String[] args) {
        String regex = ".*www.*"; /** Метод matches() проверяет, соответствует ли вся строка регулярному выражению.
         Поэтому добавляют .* перед и после: это означает "любые символы до и после 'www'".
         То есть ".*www.*" означает: "вся строка должна содержать 'www' где-то внутри".*/
        String actual = "www.telran.de";

        Pattern pattern = Pattern.compile(regex);
        boolean matches = pattern.matcher(actual).matches();
        System.out.println("Actual string contains REGEX(" + regex + ") = " + matches);

        boolean result = Pattern.matches(regex, actual);
        System.out.println("Actual contains = " + result);
    }
}
