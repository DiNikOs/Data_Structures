package ru.geekbrain.HW.HW3.deQueue;

public class HW3_deQueTest {
    public static void main(String[] args) {

        DeQue<Integer> deq = new DeQueImpl<>(6);
        System.out.println("-------------");
        for (int i = 1; i < 5 ; i++) {
            insertRight(deq, i); // 1 2 3 4
        }
        insertLeft(deq, 5); // 5 1 2 3 4
        insertLeft(deq, 6); // 6 5 1 2 3 4
        removeLeft(deq); //5 1 2 3 4
        removeRight(deq); // 5 1 2 3
        displayRightToLeft(deq); //Stack
        System.out.println("-------------");
        for (int i = 1; i < 5 ; i++) {
            insertRight(deq, i); // 1 2 3 4
        }
        insertLeft(deq, 5); // 5 1 2 3 4
        insertLeft(deq, 6); // 6 5 1 2 3 4
        removeLeft(deq); //5 1 2 3 4
        removeRight(deq); // 5 1 2 3
        displayLeftToRight(deq); // Queue
    }

    private static <E> void insertRight(DeQue<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(DeQue<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(DeQue<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(DeQue<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(DeQue<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(DeQue<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}
