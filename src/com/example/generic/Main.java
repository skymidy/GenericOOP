package com.example.generic;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(10);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.find(10));
        arrayList.set(1, 1);
        System.out.println(arrayList.get(1));
        arrayList.remove(1);

        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.add(22);
        System.out.println(l.get(0));
        System.out.println(l.find(22));
        l.add(21);
        l.add(2);
        System.out.println(l.get(0) +" "+ l.get(1) +" "+ l.get(2));
        l.remove(1);
        System.out.println(l.get(1));

    }
}
