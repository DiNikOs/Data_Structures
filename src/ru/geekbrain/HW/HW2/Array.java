package ru.geekbrain.HW.HW2;

public interface Array<E> {

    void add(E value);

    E get(int index);

    boolean remove(E value);

    default boolean contains(E value) {
        return indexOf(value) != -1;
    }

    int indexOf(E value);
    int indexOfBinary(E value);

    int size();
    boolean isEmpty();

    void display();

    void sortBubble();
    void sortSelect();
    void sortInsert();
    Array<Integer> sortInsertInt (Array<Integer> arr);

    Array<E> copy (Array<E> arr);
    Array<Integer> fillRnd (int len);
}
