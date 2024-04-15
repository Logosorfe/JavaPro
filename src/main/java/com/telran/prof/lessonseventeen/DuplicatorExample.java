package com.telran.prof.lessonseventeen;

public class DuplicatorExample {

    public static void main(String[] args) {
        String catalog = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessonseventeen/files";
        Duplicator duplicator = new Duplicator(catalog);
        duplicator.duplicate("SoutExample.java", "text.txt");
    }
}
