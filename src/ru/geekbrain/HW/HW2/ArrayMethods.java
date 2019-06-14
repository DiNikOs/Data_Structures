package ru.geekbrain.HW.HW2;

import java.util.Arrays;

import static java.lang.Math.random;

public class ArrayMethods <E extends Object & Comparable<? super E>> implements Array<E> {

    private static final int INITIAL_CAPACITY = 16;

    protected E[] data;
    protected int size;
    Array<E> array2;
    Array<Integer> arrayRnd;

    public ArrayMethods() {
        this(INITIAL_CAPACITY);
    }


    @SuppressWarnings("unchecked")
    public ArrayMethods(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    //О(N)
    public void add(E value) {
        checkGrow();
        data[size++] = value;
    }

    protected void checkGrow() {
        if (size == data.length) {
            data = grow();
        }
    }

    private E[] grow() {
        return Arrays.copyOf(data, data.length * 2);
    }

    public E[] createArray (int i) {
        E arr[] = (E[]) new Object[i];
        return arr;
    }

    @Override
    //О(1)
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidArrayStateException(index, size);
        }
    }

    @Override
    //О(N)
    public boolean remove(E value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    @Override//O(logN)
    public int indexOfBinaty(E value) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if ( data[mid].equals(value) ) {
                return mid;
            }
            else if ( value.compareTo(data[mid]) > 0 ) {
                low = mid + 1;
            }
            else  {
                high = mid - 1;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println("-----");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("-----");
    }

    @Override
    public void sortBubble() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int index1, int index2) {
        E temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    @Override
    public void sortSelect() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            swap(i, minIndex);
        }
    }

    @Override
    public void sortInsert() {
        for (int i = 1; i < size; i++) {
            E temp = data[i];
            int in = i;
            while (in > 0 && data[in - 1].compareTo(temp) >= 0) {
                data[in] = data[in - 1];
                in--;
            }
            data[in] = temp;
        }
    }

    @Override
    public Array<E> clone(Array<E> arr) {
        array2 = new ArrayMethods<>(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            array2.add((arr.get(i)));
        }
        return array2;
    }

    @Override
    public Array<Integer> fillRnd(int len) {
        arrayRnd = new ArrayMethods<>(len);
        System.out.println("\n" + "arrSize= " + len);
        for (int i = 0; i <len ; i++) {
            arrayRnd.add((int)(len*random()));
        }
        return arrayRnd;
    }

}
