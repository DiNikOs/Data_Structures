package ru.geekbrain.HW.HW2;

import static java.lang.Math.random;
import static ru.geekbrain.tests.HW2.TestHW2.*;

public class Main {

    public static final int SIZE = 1000;
    public static final int SIZE1 = 10;
    public static final int X = 1000000000;

    public static void main(String[] args) {

        ArrayMethod arr0 = new ArrayMethod(SIZE1);
        arr0.display();
        arr0.insert(5);
        arr0.insert(6);
        arr0.insert(7);
        arr0.insert(8);
        arr0.insert(9);
        System.out.println("insert");
        arr0.display();
        System.out.println("\n" + "delete");
        arr0.delete(6);
        arr0.display();

        Array<Integer> array = new ArrayMethods<>(SIZE);
        Array<Integer> array2 = new ArrayMethods<>(SIZE);
        Array<Integer> array3 = new ArrayMethods<>(SIZE);
        Array<Integer> array4 = new ArrayMethods<>(SIZE);
        Array<Integer> array5 = new ArrayMethods<>(SIZE);

        fillRndSort(array);
        array.display();
        System.out.println();
        array2 = array2.copy(array);
        array3 = array3.copy(array);
        array4 = array4.copy(array);
        array5 = array5.copy(array);

        testHW2Sort(array2, "sortBubble");
        testHW2Sort(array3, "sortSelect");
        testHW2Sort(array4, "sortInsert");
        testHW2Find(array5, "find", 77);
        testHW2Find(array5, "findSort", 77);
        testHW2Find(array5, "findBinary", 77);
    }

    public static Array<Integer> fillRndSort(Array<Integer> array) {
        System.out.println("\n" + "arrSize= " + SIZE);
        int arr[] = new int [SIZE];
        int j = 0;
        int a = 0;
        while (a!=SIZE) {
            j = (int)(SIZE*random());
            if (arr[j] == 0) {
                array.add(j+1);
                arr[j] = 1;
                a++;
            }
        }
        System.out.println();
        return array;
    }
}
