package com.telran.prof.springlessons.lesson31_32_33.controller;

import com.telran.prof.springlessons.lesson31_32_33.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

//@Controller
public class ExampleController {

//    @Autowired // 2. Field injection (Type injection, Name injection)
//    @Qualiffier("beanOne")
//    private ExampleService exampleService;

    @Autowired
    private List<ExampleService> exampleServices = new ArrayList<>();

//    @Autowired // 2. Field injection (Type injection, Name injection)
//    private ExampleService exampleServiceImplV2;
//
//    @Autowired // 1. Construction injection
//    public ExampleController (ExampleService exampleService) {
//        this. exampleService = exampleService;
//    }

    public String example() {
        String result = "";
        for (ExampleService exampleService : exampleServices) {
            result = result + " " + exampleService.getResult();
        }
        //String result = exampleService.getResult();
        return result;
    }
}
