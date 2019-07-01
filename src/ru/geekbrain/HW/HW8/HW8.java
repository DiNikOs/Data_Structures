package ru.geekbrain.HW.HW8;

public class HW8 {
    public static void main(String[] args) {
        ChainHash hashTable = new ChainHash(5);
        Item item1 = new Item(23, "Dima");
        Item item2 = new Item(34, "Lena");
        Item item3 = new Item(14, "Polena");

        hashTable.add(item1);
        hashTable.add(item2);
        hashTable.add(item3);

        System.out.println("After insert:");
        hashTable.display();
        getSize(hashTable);
        System.out.println("After remove:");
        hashTable.remove(item1);
        hashTable.display();

        System.out.println("Find Polena: " + hashTable.findId(item3.getId()));
        getSize(hashTable);
        System.out.println("Finish");
    }

    public static void getSize(ChainHash hashTable) {
        System.out.println("Size HashTable is " + hashTable.getSize());
    }

}
