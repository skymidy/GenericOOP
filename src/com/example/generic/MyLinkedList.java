package com.example.generic;


public class MyLinkedList<T> implements MyList<T> {

    private class Node<Y> {
        public Node<Y> previous = null;
        public Node<Y> next = null;
        public Y payload;
    }

    private Node<T> head;

    public MyLinkedList() {
        head = null;
    }


    public void add(T element) {

        Node<T> newNode = new Node<>();
        newNode.payload = element;

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.previous = current;

    }

    public void set(T element, int position) {
        Node<T> current = head;

        for (int i = 0; i < position; i++) {
            if(current.next == null){
                Node<T> newNode = new Node<>();
                current.next = newNode;
                newNode.previous = current;
            }
            current = current.next;
        }

        current.payload = element;
    }

    public void remove(int position) {

        Node<T> current = head;
        for (int i = 0; i < position; i++) {
            if (current.next == null) {
                System.out.println("Error: index out of bounds");
                return;
            }
            current = current.next;
        }
        if (current.next != null) {
            current.previous.next = current.next;
        } else {
            current.previous.next = null;
        }
    }

    public int find(T element) {
        Node<T> current = head;
        int count = 0;
        while (current != null && current.equals(element)) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return -1;
        }

        return count;
    }

    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current.next == null) {
                System.out.println("Error: index out of bounds");
                return null;
            }
            current = current.next;
        }
        return current.payload;
    }
}
