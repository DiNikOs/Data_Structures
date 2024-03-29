package ru.geekbrain.less3.datastructure.ads.stack;

public interface Stack<E> {

    void push(E value);

    E pop();

    E peek();

    int size();

    boolean isEmpty();

    boolean isFull();
}
