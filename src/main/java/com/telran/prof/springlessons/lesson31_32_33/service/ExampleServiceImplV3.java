package com.telran.prof.springlessons.lesson31_32_33.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImplV3 implements ExampleService{

    @Override
    public String getResult() {
        return "World";
    }
}
