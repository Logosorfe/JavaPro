package com.telran.prof.springlessons.lesson31.example.repository;

public class SimpleWordRepository implements WordRepository {

    @Override
    public String getWord() {
        return "Hello from repo";
    }
}
