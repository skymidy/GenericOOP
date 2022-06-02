package com.example.generic;

import java.util.ArrayList;

public class MyArrayList<T> implements MyList<T> {
    private ArrayList<T> arr;
    private int length;

    public int size() {
        return length;
    }

    public MyArrayList() {
        length = 0;
        arr = new ArrayList<>(length);
    }

    public MyArrayList(int n) {
        length = n;
        arr = new ArrayList<>(length);
    }

    public void add(T element) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == null) {
                arr.set(i, element);
                return;
            }
        }

        length = (length == 0) ? 2 : length * 2;
        ArrayList<T> temp = new ArrayList<>(length);
        for (int i = 0; i < arr.size(); i++) {
            temp.add(arr.get(i));
        }

        temp.add(element);
        arr = temp;
    }

    public void set(T element, int position) {
        if (position >= length) {
            System.out.println("Error: array index out of bounds");
            return;
        }
        if (position < arr.size()) arr.set(position, element);
        else {
            for (int i = arr.size() - 1; i < position - 1; i++) {
                arr.add(null);
            }
            arr.add(element);
        }
    }

    public void remove(int position) {
        length -= 1;
        ArrayList<T> temp = new ArrayList<>(length);
        int cur = 0;
        for (int i = 0; i < length; i++) {
            if (i == position) continue;
            temp.add(arr.get(i));
        }
        arr = temp;
    }

    public int find(T element) {
        for (int i = 0; i < length; i++) {
            if (arr.get(i).equals(element)) {
                return i;
            }
        }

        System.out.println("Element not found");
        return -1;
    }

    public T get(int index) {

        if (index < 0 || index >= length) {
            System.out.println("Error: array index out of bounds");
        }

        return arr.get(index);
    }
}
