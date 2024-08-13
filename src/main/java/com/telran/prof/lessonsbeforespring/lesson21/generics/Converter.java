package com.telran.prof.lessonsbeforespring.lesson21.generics;

public interface Converter<Entity, Dto> {

    Dto one(Entity entity);

    Entity two(Dto dto);
}