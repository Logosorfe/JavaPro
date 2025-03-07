package com.telran.prof.springlessons.lesson33.bookshelf.service;

import com.telran.prof.springlessons.lesson33.bookshelf.model.Book;
import com.telran.prof.springlessons.lesson33.bookshelf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Book create(Book book) {
        return repository.createBook(book);
    }

    @Override
    public List<Book> getAll() {
        return repository.getAll();
    }

    @Override
    public Book getByIsbn(String isbn) {
        return repository.getByIsbn(isbn);
    }
}
