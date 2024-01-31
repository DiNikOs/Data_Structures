package ru.geekbrain.HW.HW8;

public interface HashTable {

    boolean put(Item item, Integer cost);

    Integer get(Item item);

    boolean remove(Item item);

    int size();

    boolean isEmpty();

    void display();

    //Item find(int id);

    int hashFunc(Item item);
}
