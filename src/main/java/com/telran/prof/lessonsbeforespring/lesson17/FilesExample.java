package com.telran.prof.lessonsbeforespring.lesson17;

import java.io.File;
import java.util.Arrays;

public class FilesExample {

    public static void main(String[] args) {
        String path = "C:/Users/Logosorfe/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/files/out.txt";

        //Create file as object
        File file = new File(path);

        // check directory
        System.out.println("Is directory " + file.isDirectory());

        // that file exists
        System.out.println("File exists " + file.exists());
        String dirPath = "C:/Users/Logosorfe/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/files/";
        File dir = new File(dirPath);
        System.out.println("Is directory " + dir.isDirectory());

        //create directory
        File newDirectory = new File(dirPath + "another");
        System.out.println("New directory exists - " + newDirectory.exists());
        boolean isCreated = newDirectory.mkdir();
        System.out.println("New directory has just been created - " + isCreated);

        //file delete
        File fileToDelete = new File(path);
        boolean isDeleted = fileToDelete.delete();
        System.out.println("file from files is delete ? " + isDeleted);

        //list file names
        String pathToLesson = "C:/Users/Logosorfe/IdeaProjects/JavaPro/src/main/java/com/telran/prof/lessonsbeforespring/lesson17/";
        File lesson = new File(pathToLesson);
        String[] list = lesson.list();
        System.out.println(Arrays.toString(list));

        //list files
        File[] files = lesson.listFiles();
        for (File currentFile : files) {
            System.out.println("File name is " + currentFile.getName() + " ; length is "
                    + currentFile.length());
        }
    }
}
