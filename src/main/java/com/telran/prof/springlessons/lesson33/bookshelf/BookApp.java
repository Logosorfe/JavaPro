package com.telran.prof.springlessons.lesson33.bookshelf;

import com.telran.prof.springlessons.lesson33.bookshelf.controller.BookController;
import com.telran.prof.springlessons.lesson33.bookshelf.model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Scanner;

@ComponentScan(basePackages = "com.telran.prof.springlessons.lesson33.bookshelf")
public class BookApp {
    public static void main(String[] args) {
//        USER <-> CONTROLLER <-> SERVICE <-> REPOSITORY <-> MODEL

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookApp.class);
        BookController controller = context.getBean(BookController.class);
        System.out.println("0 - Exit, 1 - Get All, 2 - Create book, 3 - Get by id");
        Scanner scanner = new Scanner(System.in);
        int data = -1;
        while (data != 0) {
            data = scanner.nextInt();
            switch (data) {
                case 1:
                    List<Book> all = controller.getAll();
                    System.out.println(all);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Input isbn: ");
                    String isbn = scanner.next();
                    Book book = controller.getByIsbn(isbn);
                    System.out.println(book);
                    break;
                default:
            }
            System.out.println("\nInput option: ");
        }
    }
}
