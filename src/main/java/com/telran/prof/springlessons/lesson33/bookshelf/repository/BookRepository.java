package com.telran.prof.springlessons.lesson33.bookshelf.repository;

import com.telran.prof.springlessons.lesson33.bookshelf.model.Book;

import java.util.List;

public interface BookRepository {

    Book createBook(Book book);

    List<Book> getAll();

    Book getByIsbn(String isbn);
}
