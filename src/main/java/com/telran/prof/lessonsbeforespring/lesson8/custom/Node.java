package com.telran.prof.lessonsbeforespring.lesson8.custom;

public class Node {

    private Integer data;
    private Node next;

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
