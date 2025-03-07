package com.telran.prof.springlessons.lesson33.bookshelf.controller;

import com.telran.prof.springlessons.lesson33.bookshelf.model.Book;
import com.telran.prof.springlessons.lesson33.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    public List<Book> getAll() {
        return service.getAll();
    }

    public Book create(String title, int year) {
        return service.create(new Book(title, year));
    }

    public Book getByIsbn(String isbn) {
        return service.getByIsbn(isbn);
    }
}
