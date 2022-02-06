package com.geekbrains;

public class OwnLinkedList<T> {
    private long size;
    private Node head;
    private Node tail;

    public OwnLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean clearNodes() {
        boolean result = false;

        if(size != 0) {
            Node current = head;
            for(int i = 0; i < size; i++) {
                Node thisNode = current;
                current = current.next;
                thisNode.next = null;
            }
            head = null;
            size = 0;
            result = true;
        }

        return result;
    }

    public void addNode(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    public void addNode(int index,T data) {
        if(index > this.size) {
           throw new MyOutOfIndexException("Индекс больше, чем размер коллекции!");
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if(index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        size++;
    }

    public void deleteNode(int index) {
        if(index > this.size) {
            throw new MyOutOfIndexException("Индекс больше, чем размер коллекции!");
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node nextNode = current.next;
        current.next = nextNode.next;

        nextNode = null;

        size--;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("Односвязный список пуст");
            return;
        }

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void display(int index) {
        if (index > size) {
            System.out.println("Размер списка больше чем заданный индекс");
            return;
        }

        Node current = head;

        for (int i = 1; i <= index; i++) {
            current = current.next;
        }

        System.out.println(current.data);
    }


    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
