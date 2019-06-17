package ru.geekbrain.tests.HW2;

import ru.geekbrain.HW.HW2.Array;
import ru.geekbrain.HW.HW2.ArrayMethods;

public class TestHW2 <E extends Object & Comparable<? super E>> implements Array<E> {

    Array<E> array;
    private static Array<Integer> array2;

    public static final int X = 1000000000;

    public TestHW2(Array<E> array) {
        this.array = array;

    }

    public static void testHW2Sort (Array<Integer> array, String s) {
        long startTime = System.nanoTime();
        System.out.println(s + " Start");
        switch (s) {
            case ("sortBubble"):
                array.sortBubble();
                break;
            case ("sortSelect"):
                array.sortSelect();
                break;
            case ("sortInsert"):
                array.sortInsert();
                break;
        }
        long endTime = System.nanoTime();
        System.out.println(s + " DONE on " + ((double)(endTime - startTime)/X) + " s");
        System.out.println("-------");
    }

    public static void testHW2Find (Array<Integer> array, String s, int i) {
        array2 = new ArrayMethods<>(array.size());
        array2 = array2.sortInsertInt(array);
        long startTime = System.nanoTime();
        System.out.println(s + " Start");
        switch (s) {
            case ("find"):
                if (array.indexOf(i)>0) System.out.println(" true");
                array.display();
                break;
            case ("findSort"):
                if (array2.indexOf(i)>0) System.out.println(" true");
                array2.display();
                break;
            case ("findBinary"):
                if (array2.indexOfBinary(i)>0) System.out.println(" element find");
                break;
        }
        long endTime = System.nanoTime();
        System.out.println(s + " DONE on " + ((double)(endTime - startTime)/X) + " s");
        System.out.println("-------");
    }

    @Override
    public void add(E value) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean remove(E value) {
        return false;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int indexOfBinary(E value) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void display() {

    }

    @Override
    public void sortBubble() {

    }

    @Override
    public void sortSelect() {

    }

    @Override
    public void sortInsert() {

    }

    @Override
    public Array<Integer> sortInsertInt(Array<Integer> arr) {
        return null;
    }

    @Override
    public Array<E> copy(Array<E> arr) {
        return null;
    }

    @Override
    public Array<Integer> fillRnd(int len) {
        return null;
    }
}
