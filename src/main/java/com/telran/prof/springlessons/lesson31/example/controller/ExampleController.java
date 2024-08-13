package com.telran.prof.springlessons.lesson31.example.controller;

import com.telran.prof.springlessons.lesson31.example.service.ExampleService;

public class ExampleController {

    private final ExampleService exampleService ;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public String example() {
        String result = exampleService.getResult();
        return result;
    }
}
