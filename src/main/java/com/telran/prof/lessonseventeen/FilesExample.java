package com.telran.prof.lessonseventeen;

import java.io.File;
import java.util.Arrays;

public class FilesExample {

    public static void main(String[] args) {
        String path = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessonseventeen/files/out.txt";

        //Create file as object
        File file = new File(path);

        // check directory
        System.out.println("Is directory " + file.isDirectory());

        // that file exists
        System.out.println("File exists " + file.exists());
        String dirPath = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessonseventeen/files/";
        File dir = new File(dirPath);
        System.out.println("Is directory " + dir.isDirectory());

        //create directory
        File newDirectory = new File(dirPath + "/another");
        System.out.println("New directory is exists " + newDirectory.exists());
        boolean mkdir = newDirectory.mkdir();
        System.out.println("New directory is exists " + newDirectory.exists());

        //file delete
        File fileToDelete = new File(path);
        boolean delete = fileToDelete.delete();
        System.out.println("file from files is delete ? " + delete);

        //list file names
        String pathToLesson = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/prof/lessonseventeen/";
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
