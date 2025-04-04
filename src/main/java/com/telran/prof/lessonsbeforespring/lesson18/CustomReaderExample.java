package com.telran.prof.lessonsbeforespring.lesson18;

public class CustomReaderExample {

    public static void main(String[] args) {
        //        try (CustomReader reader = new CustomReader()) {
//            int[] array = {13, 2, 4};
//            System.out.println(array[5]); //IOFB
//            System.out.println("Hello");
//        } catch (Exception exception) {
//            System.out.println("Hello from Catch block");
//            exception.printStackTrace();
//        }

        try {
            CustomReader reader = new CustomReader();
            int[] array = {13, 2, 4};
            System.out.println(array[5]); //IOFB
            System.out.println("Hello");
            reader.close(); /** как видно - не работает, поэтому закрывать потоки без Autoclosable надо в самом конце,
             когда - после блока try-catch*/
        } catch (Exception exception) {
            System.out.println("Hello from Catch block");
            exception.printStackTrace();
        }
    }
}