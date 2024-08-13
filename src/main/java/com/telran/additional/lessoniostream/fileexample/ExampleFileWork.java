package com.telran.additional.lessoniostream.fileexample;

import java.io.File;

public class ExampleFileWork {

    public static void main(String[] args) {
        String pathToFile = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/text.txt";
        File file = new File(pathToFile);

        //1.Check that file exists
        boolean exists = file.exists();
        System.out.println("File exists " + exists);

        // 2.Create dir
        String pathToDir = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/fileexample/newdir";
        file = new File(pathToDir);
        boolean created = file.mkdir();
        System.out.println("Is created " + created);

        //3.Get length
        String pathToRealFile = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/fileexample/ExampleFileWork.java";
        file = new File(pathToRealFile);
        System.out.println("Length = " + file.length());

        //4.Delete file
        String pathToDelete = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/fileexample/fileToDelete.txt";
        file = new File(pathToDelete);
        boolean delete = file.delete();
        System.out.println("Is deleted " + delete);

        //5.Check that it is directory
        file = new File(pathToDir);
        System.out.println("Is directory " + file.isDirectory());

        //6.Get all file names
        String pathToAllFiles = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/";
        file = new File(pathToAllFiles);
        String[] list = file.list();
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println();

        //7.Get all files in directory
        file = new File(pathToAllFiles);
        File[] files = file.listFiles();
        for (File currentFile : files) {
            String name = currentFile.getName();
            long length = currentFile.length();
            System.out.printf("File with name %s, has length %d\n", name, length);
        }
    }
}