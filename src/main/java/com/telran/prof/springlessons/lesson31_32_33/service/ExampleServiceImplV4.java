package com.telran.prof.springlessons.lesson31_32_33.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImplV4 extends ExampleServiceImplV3 {


    @Override
    public String getResult() {
        return super.getResult() + " Again";
    }
}
