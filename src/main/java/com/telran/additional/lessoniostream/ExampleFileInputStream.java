package com.telran.additional.lessoniostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleFileInputStream {

    public static void main(String[] args) {
        // c:\\data\\read   , c:/data/read/
        String path = "/Volumes/Macintosh HD - Data 1/telran3010prof/src/main/java/com/telran/additional/lessoniostream/file.txt";

        //->H E L L O read
        // H->E L L O read
        // H E->L L O read
        // ....
        // H E->L L O -> read = -1
        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            //Option one
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print(data + " ");
                data = fileInputStream.read();
            }

            //OR (for both have to recreate stream)

            //Option two
            while (fileInputStream.available() > 0) {
                System.out.print((char) fileInputStream.read() + " ");
            }

//        } catch (FileNotFoundException exception) {
//            System.out.printf("File with path %s not found please try again", path);
//        } catch (IOException exception) {
//            System.out.println("Problem with access to file " + exception.getMessage());
//        }
            fileInputStream.close();
        } catch (IOException exception) {
            System.out.println("We have some problem with file " + exception.getMessage());
        }
        System.out.println("\nend of application");
    }
}
