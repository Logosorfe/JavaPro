package com.telran.prof.lessonsbeforespring.lesson17;

public class DuplicatorExample {

    public static void main(String[] args) {
        String catalog = "C:/Users/logos/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/files/";
        Duplicator duplicator = new Duplicator(catalog);
        duplicator.duplicate("SoutExample.java", "text.txt");
    }
}
