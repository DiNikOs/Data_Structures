package ru.geekbrain.HW.HW6;

import java.util.Random;

public class HW6 {

    public static void main(String[] args) {
        int deep = 4;
        int treeCount = 20;
        int diff = 25;
        seeTree(deep, diff, treeCount);
    }

    public static void seeTree(int deep, int diff, int treeCount) {
        int balancedTreeCount = 0;
        int nodeCount = (int) (Math.pow(2, deep) - 1);
        boolean treeView = false;

        for (int i = 0; i < treeCount; i++) {
            Tree<Integer> treeTest = new TreeImpl<>(deep);
            for (int j = 0; j < nodeCount; j++) {
                treeTest.add(randomMinMax(diff));
            }
            if (treeTest.isBalanced()) {
                balancedTreeCount++;
                if (!treeView) {
                    treeView = true;
                    treeTest.display();
                }
            }
            treeTest.display();
        }
        System.out.println("Balanced Tree Count = " + ((balancedTreeCount / (treeCount * 1.0)) * 100) + "%");
    }

    private static int randomMinMax(int diff) {
        Random random = new Random();
        diff = diff*2;
        int i = random.nextInt(diff + 1);
        return (i -= diff/2);
    }
}

