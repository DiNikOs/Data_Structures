package ru.geekbrain.HW.HW3.deQueue;

public interface DeQue<E> {

    boolean insertRight(E value);

    boolean insertLeft(E value);

    E removeLeft();

    E removeRight();

    int size();

    boolean isEmpty();

    boolean isFull();
}
