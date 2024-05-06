package com.telran.prof.lessontwentyone.generics;

public interface Converter<Entity, Dto> {

    Dto one(Entity entity);

    Entity two(Dto dto);
}