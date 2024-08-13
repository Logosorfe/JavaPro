package com.telran.prof.lessonsbeforespring.lesson23.uni;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Student {

    private int id;

    @EqualsAndHashCode.Exclude
    private String name;

    @EqualsAndHashCode.Exclude
    private int age;

    @EqualsAndHashCode.Exclude
    private Degree degree;
}
