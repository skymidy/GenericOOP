package com.example.generic;

public interface MyList<T> {
    void add(T element);

    void set(T element, int position);

    void remove(int position);

    int find(T element);

    T get(int index);
}