package com.telran.prof.lessonsbeforespring.lesson11.queue.customdeque;

public class CustomDequeApp {

    public static void main(String[] args) {
        MyDeque customArrayDeque = new CustomArrayDeque(16);
        customArrayDeque.addToHead(10);
        //10
        customArrayDeque.addToHead(15);
        //10 15
        customArrayDeque.addToTail(5);
        //5 10 15
        customArrayDeque.addToTail(8);
        // ->8 5 10 15->

        //head = 4;
        //tail = 4;
        //        head      tail
        //[___null 15 10  5  8  null___]
        // 0  1  2  3  4  5  6  7  8   indexes

        System.out.println(customArrayDeque);
        System.out.println(customArrayDeque.pollHead());
        System.out.println(customArrayDeque.pollTail());

        System.out.println(customArrayDeque);
    }
}
