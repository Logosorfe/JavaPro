package com.telran.prof.lessonseventeen;

public class DuplicatorExample {

    public static void main(String[] args) {
        String catalog = "C:/Users/logos/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonseventeen/files";
        Duplicator duplicator = new Duplicator(catalog);
        duplicator.duplicate("SoutExample.java", "text.txt");
    }
}
