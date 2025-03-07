package com.telran.prof.springlessons.lesson33.bookshelf.service;

import com.telran.prof.springlessons.lesson33.bookshelf.model.Book;

import java.util.List;

public interface BookService {

    Book create(Book book);

    List<Book> getAll();

    Book getByIsbn(String isbn);
}
