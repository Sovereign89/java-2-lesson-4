package com.geekbrains;

public class OwnLinkedListMain {
    public static void main(String[] args) {
        OwnLinkedList<Integer> integerOwnLinkedList = new OwnLinkedList<>();
        integerOwnLinkedList.addNode(111);
        integerOwnLinkedList.addNode(222);
        integerOwnLinkedList.addNode(333);
        integerOwnLinkedList.addNode(444);
        integerOwnLinkedList.addNode(1,555);
        integerOwnLinkedList.deleteNode(2);
        integerOwnLinkedList.clearNodes();

        integerOwnLinkedList.display();
    }
}
