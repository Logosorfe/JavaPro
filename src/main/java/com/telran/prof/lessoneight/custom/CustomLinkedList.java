package com.telran.prof.lessoneight.custom;

public class CustomLinkedList {

    private Node head;
    private int size;

    public void add(int data) {
        //Создаем новый элемент
        Node newNode = new Node(data, null);
        size++;
        //если связный список пустой, то выполнится условие ниже
        if (head == null) {
            head = newNode;
            return;
        }

        //Доходим до конца связного списка и присваиваем конечному
        //элементу ссылку на новый элемент
        //O(n) - n count of elements
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void add(int index, int data) {
        if (index < 1 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        //index 0 1 2 3 4
        //data  5 4 6 7 8
        //add by index 2
        //Создаем новый элемент
        Node newNode = new Node(data, null);
        Node current = head;
        int count = 0;
        while (count < index - 1) {  //0 < 1 , 1<1
            current = current.getNext(); // current = 4
            count++; // 1
        }

        Node next = current.getNext();
        newNode.setNext(next);
        current.setNext(newNode);
    }

    public void addFirst(int data) {
        Node newNode = new Node(data, null);
        size++;
        //если связный список пустой, то выполнится условие ниже
        if (head == null) {
            head = newNode;
            return;
        }

        //Если связный список уже имеет элементы
        newNode.setNext(head);
        head = newNode;
    }

    //O(n)
    private String print() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }

        return sb.toString();
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return print();
    }
}
