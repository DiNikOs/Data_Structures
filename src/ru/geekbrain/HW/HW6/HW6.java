package ru.geekbrain.HW.HW6;

import java.util.Random;

public class HW6 {

    //Tree<Integer> treeTest;

    public static void main(String[] args) {
        Tree<Integer> treeTest = new TreeImpl<>();
        seeTree(treeTest, 5, -20, 20);
        
    }

    public static void seeTree (Tree <Integer> treeTest, int deep, int min, int max) {
       // int count = factorial(deep);
        int count = deep;
        for (int i = 0; i <= count; i++) {
            treeTest.add(randomMinMax(min, max));
        }
        treeTest.display();
        treeTest.traverse(Tree.TraverseMode.IN_ORDER);
        System.out.println("---------------------------");
        treeTest.traverse(Tree.TraverseMode.PRE_ORDER);
        System.out.println("---------------------------");
        treeTest.traverse(Tree.TraverseMode.POST_ORDER);


    }

    public static int randomMinMax (int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
