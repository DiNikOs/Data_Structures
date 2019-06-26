package ru.geekbrain.HW.HW6;

public interface Tree<E> {

    void setCountDeep(E i);

    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER,
    }

    int deep();

    boolean add(E value);

    boolean find(E value);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void traverse(TraverseMode mode);

    void display();
}
