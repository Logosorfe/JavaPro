package com.telran.prof.lessonsbeforespring.lesson11.queue.customdeque;

public interface MyDeque {

    void addToHead(Integer element);

    void addToTail(Integer element);

    Integer pollHead();

    Integer pollTail();

    Integer peekHead();

    Integer peekTail();

    boolean isEmpty();
}
