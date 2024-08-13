package com.telran.prof.springlessons.lesson30.springbootdemo.service;



import com.telran.prof.springlessons.lesson30.springbootdemo.model.Coffee;

import java.util.Set;

public interface CoffeeService {

    Set<Coffee> getAll();

    Coffee getById(String uuid);

    Coffee add(Coffee coffee);
}
