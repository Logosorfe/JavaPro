package com.telran.prof.springlessons.lesson31.example.service;

import com.telran.prof.springlessons.lesson31.example.repository.WordRepository;

public class ExampleServiceImpl implements ExampleService {

    private final WordRepository repository;

    public ExampleServiceImpl(WordRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getResult() {
        return repository.getWord();
    }
}
