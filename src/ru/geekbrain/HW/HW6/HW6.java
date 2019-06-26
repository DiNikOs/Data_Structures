package ru.geekbrain.HW.HW6;

import java.util.Random;

public class HW6 {

    public static void main(String[] args) {
        Tree<Integer> treeTest = new TreeImpl<>();
        seeTree(treeTest, 5, -20, 20);
        
    }

    public static void seeTree (Tree <Integer> treeTest, int deep, int min, int max) {

        int count = 0;
        for (int i = 0; i < deep; i++) {

            treeTest.add(randomMinMax(min, max));

            count =  treeTest.deep();
          //  System.out.println("count= " + count);
        }
        treeTest.display();
        treeTest.traverse(Tree.TraverseMode.IN_ORDER);

        //System.out.println("Deep= " + treeTest.deep());

        System.out.println("---------------------------");
        treeTest.traverse(Tree.TraverseMode.PRE_ORDER);
        //System.out.println("Deep= " + treeTest.deep());

        System.out.println("---------------------------");
        treeTest.traverse(Tree.TraverseMode.POST_ORDER);
        //System.out.println("Deep= " + treeTest.deep());

    }

    public static int randomMinMax (int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }
}
