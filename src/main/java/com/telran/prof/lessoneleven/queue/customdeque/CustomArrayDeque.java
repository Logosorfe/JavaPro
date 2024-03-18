package com.telran.prof.lessoneleven.queue.customdeque;

import java.util.Arrays;

public class CustomArrayDeque implements MyDeque {

    private final Integer[] elements;

    private int head;

    private int tail;

    public CustomArrayDeque(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be more than 1");
        }

        this.elements = new Integer[capacity];
    }

    @Override
    public void addToHead(Integer element) {

    }

    @Override
    public void addToTail(Integer element) {

    }

    @Override
    public Integer pollHead() {
        return null;
    }

    @Override
    public Integer pollTail() {
        return null;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peelTail() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
