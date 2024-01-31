package ru.geekbrain.HW.HW5;



import java.util.ArrayList;
import java.util.List;

public class SortedArrayRec  {

    static int[] values = new int[] {600, 5000, 1500, 40000, 500};
    static int[] weights = new int[] {1, 2, 4, 2, 1};
    static int W = 4;
    private static int items(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (weights[i] > W) {
            return items(i-1, W);
        } else {
            return Math.max(items(i-1, W), items(i-1, W - weights[i]) + values[i]);
        }
    }

    public static void main(String[] args) {
        items(values.length - 1, W);
        System.out.println(items(values.length - 1, W));}

}
