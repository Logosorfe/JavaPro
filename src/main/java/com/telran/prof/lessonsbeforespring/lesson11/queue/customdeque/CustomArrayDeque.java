package com.telran.prof.lessonsbeforespring.lesson11.queue.customdeque;


public class CustomArrayDeque implements MyDeque {

    private final Integer[] elements;

    private int head;

    private int tail;

    public CustomArrayDeque(int capacity) {
        if (capacity < 16) {/** При такой записи (capacity < 1) можно создать массив с одним
         элементом. Мало того что само дальнейшее утверждение "Capacity must be more than 1"
         не будет работать. Так ещё и выдаст ошибку ArrayIndexOutOfBoundsException при
         использовании метода addToHead, созданного тут. Поставил изначальный размер в 16 элементов.*/
            throw new IllegalArgumentException("Capacity must be more than 15");
        }

        this.elements = new Integer[capacity];
        this.head = (capacity - 1) / 2;
        this.tail = head;
    }

    @Override
    public void addToHead(Integer element) {/** Исправил код, так как он не учитывал
     возможности того, что на месте изначального head может быть null */
        if (elements[head] == null) {
            elements[head] = element;
        } else {
            head = head - 1;
            elements[head] = element;
        }
    }

    @Override
    public void addToTail(Integer element) {/** Тоже исправил код, так как он не учитывал
     возможности того, что на месте изначального head может быть null и поменял местами
     два выражения в коде else */
        if (elements[head] == null) {
            elements[head] = element;
        } else {
            tail = tail + 1;
            elements[tail] = element;
        }
    }

    @Override
    public Integer pollHead() { /** В настоящем ArrayDeque все элементы станут ссылаться на
     null, что здесь изначально отсутствует. Исправил */
        Integer element = elements[head];
        elements[head] = null;
        head++;
        return element;
    }

    @Override
    public Integer pollTail() { /** Тоже исправил, при этом ещё местами был напутан код */
        Integer element = elements[tail];
        elements[tail] = null;
        tail--;
        return element;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peekTail() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();/** После всех правок подправил "tail - 1"
         для нормальной работы */
        for (int i = tail; i >= head; i--) {
            sb.append(elements[i] + " ");
        }
        return sb.toString();
    }
}
