package ru.geekbrain.less5.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;

public class Countdown {

    static int  [] arr = {1,2,3,4,5,6,7,8,9,10};
    static List<Integer> arr2 = new ArrayList<>();
    static int j = 0;

    public static void main(String[] args) {
//        countDownLoop(5);

        countDownRecursion(5, arr2);
    }

    private static void countDownRecursion(int n, List<Integer> list) {
        int sum = 0;
        if (j>arr.length) j = 0;

        for (int i = 0; i < arr2.size(); i++) {
            sum = sum + arr2.get(i);
        }
       if (n == sum) {
            System.out.println(arr2);

        } else {
           arr2.add(arr[j++]);
           countDownRecursion(--n, arr2);
       }
    }

    private static void countDownLoop(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
