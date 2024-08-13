package com.telran.additional.lessoniostream.custom;

public class FileCopyApp {

    public static void main(String[] args) {
        String pathFrom = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/ExampleFileInputStream.java";
        String pathTo = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/custom/fileToCopy.txt";
        FileWorkUtil.copy(pathFrom, pathTo);


    }
}
