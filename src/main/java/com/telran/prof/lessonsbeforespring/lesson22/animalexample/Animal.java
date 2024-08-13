package com.telran.prof.lessonsbeforespring.lesson22.animalexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter // getter methods
@AllArgsConstructor // constructor for all arguments
@ToString // toString generation
public class Animal {

    private String type;
}