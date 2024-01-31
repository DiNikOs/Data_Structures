package ru.geekbrain.HW.HW8;

import java.util.LinkedList;

public class ChainHash {

    private LinkedList<Item>[] hashArr;
    private int size;

    public ChainHash(int size) {
        this.size = size;
        this.hashArr = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashArr[i] = new LinkedList<>();
        }
    }

    public boolean add(Item item) {
        int hashValue = hashFunc(item);
        return hashArr[hashValue].add(item);
    }

    public boolean remove(Item item) {
        int hashValue = hashFunc(item);
        return hashArr[hashValue].remove(item);
    }

    public void display() {
        System.out.println("-----------");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d = %s", i, hashArr[i]);
            System.out.println();
        }
        System.out.println("-----------");

    }

    public Item findId(int id) {
        int hashValue = hashFunc(id);
        for (Item item : hashArr[hashValue]) {
            System.out.println("=" + item.getTitle());
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public int getSize() {
        int i = 0;
        for (LinkedList<Item> items : hashArr) {
            if (!items.isEmpty()) {
                for (int j = 0; j < items.size(); j++) {
                    i++;
                }
            }
        }
        return i;
    }

    private int hashFunc(Item item) {
        return hashFunc(item.hashCode());
    }

    private int hashFunc(int id) {
        return id % size;
    }

    private String hashFunc(String title) {
        return title;
    }

}