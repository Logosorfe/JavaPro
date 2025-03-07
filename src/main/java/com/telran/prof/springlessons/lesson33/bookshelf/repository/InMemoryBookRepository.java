package com.telran.prof.springlessons.lesson33.bookshelf.repository;

import jakarta.annotation.PostConstruct;
import com.telran.prof.springlessons.lesson33.bookshelf.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class InMemoryBookRepository implements BookRepository {

    private Map<String, Book> storage;

    @PostConstruct
    private void init(){
        Book one = new Book("Alice in Wonderland", UUID.randomUUID().toString(), 1970);
        Book two = new Book("Java", UUID.randomUUID().toString(), 2000);
        Book three = new Book("Harry Potter", UUID.randomUUID().toString(), 2006);

        storage = Map.of(one.getIsbn(), one, two.getIsbn(), two, three.getIsbn(), three);
    }

    @Override
    public Book createBook(Book book) {
        Book createdBook = new Book(book.getTitle(), UUID.randomUUID().toString(), book.getYearOfPublishing());
        storage.put(createdBook.getIsbn(), createdBook);
        return createdBook;
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Book getByIsbn(String isbn) {
        return storage.get(isbn);
    }
}
