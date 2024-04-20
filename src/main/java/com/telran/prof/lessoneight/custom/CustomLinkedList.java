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
        Node newNode = new Node(data, null);
        size++;/** тут вообще пропустили это поле */
        if (index < 0 || index >= size) {/** при index < 1 не возможно внести узел по
         нулевому индексу, поэтому подправил код */
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.setNext(head);
            head = newNode;
            return;
        }
        //index 0 1 2 3 4
        //data  5 4 6 7 8
        //add by index 2
        //Создаем новый элемент
        Node current = head;
        int count = 0;
        while (count < index - 1) {  //0 < 1 , 1<1
            current = current.getNext(); // current = 4
            count++; // 1
        }
        newNode.setNext(current.getNext());
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
