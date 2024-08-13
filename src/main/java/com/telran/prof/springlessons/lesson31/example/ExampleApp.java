package com.telran.prof.springlessons.lesson31.example;

import com.telran.prof.springlessons.lesson31.example.controller.ExampleController;
import com.telran.prof.springlessons.lesson31.example.repository.SimpleWordRepository;
import com.telran.prof.springlessons.lesson31.example.service.ExampleServiceImpl;

public class ExampleApp {

    public static void main(String[] args) {
        SimpleWordRepository simpleWordRepository = new SimpleWordRepository();
        ExampleServiceImpl exampleService = new ExampleServiceImpl(simpleWordRepository);
     //   ExampleServiceImplV2 exampleServiceImplV2 = new ExampleServiceImplV2();
     //   ExampleServiceImplV3 exampleServiceImplV3 = new ExampleServiceImplV3();
        ExampleController exampleController = new ExampleController(exampleService);

        String example = exampleController.example();
        System.out.println(example);

        //USER - CONTROLLER -> SERVICE - >(DB) -> SERVICE -> CONTROLLER -> USER
    }
}
