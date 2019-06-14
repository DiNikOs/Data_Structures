package ru.geekbrain.HW.HW2;

public class Main {

    public static final int SIZE = 100000;
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
        array = array.fillRnd(SIZE);
        array.display();
        System.out.println();
        array2 = array2.clone(array);
        array3 = array3.clone(array);
        array4 = array4.clone(array);
        array5 = array5.clone(array);
        long startTime = System.nanoTime();
        System.out.println("sortBubble() Start");
        array2.sortBubble();
        long endTime = System.nanoTime();
        System.out.println("sortBubble() DONE on " + ((double)(endTime - startTime)/X) + " s");
        System.out.println("-------");
        long startTime2 = System.nanoTime();
        System.out.println("sortSelect() Start");
        array3.sortSelect();
        long endTime2 = System.nanoTime();
        System.out.println("sortSelect() DONE on " + ((double)(endTime2 - startTime2)/X) + " s");
        System.out.println("-------");
        long startTime3 = System.nanoTime();
        System.out.println("sortInsert() Start");
        array4.sortInsert();
        long endTime3 = System.nanoTime();
        System.out.println("sortInsert() DONE on " + ((double)(endTime3 - startTime3)/X) + " s");
        System.out.println("-------");
        long startTime4 = System.nanoTime();
        System.out.println("find Start");
        array5.indexOf(20);
        long endTime4 = System.nanoTime();
        System.out.println("find DONE on " + ((double)(endTime4 - startTime4)/X) + " s");
        System.out.println("-------");
        long startTime5 = System.nanoTime();
        System.out.println("find sorted Start");
        array4.indexOf(20);
        long endTime5 = System.nanoTime();
        System.out.println("find sorted DONE on " + ((double)(endTime5 - startTime5)/X) + " s");
        System.out.println("-------");
        long startTime6 = System.nanoTime();
        System.out.println("findBinaty Start");
        array5.indexOfBinaty(20);
        long endTime6 = System.nanoTime();
        System.out.println("findBinaty DONE on " + ((double)(endTime6 - startTime6)/X) + " s");
    }
}
