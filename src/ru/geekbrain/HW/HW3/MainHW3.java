package ru.geekbrain.HW.HW3;

import ru.geekbrain.HW.HW3.queue.PriorityQueue;
import ru.geekbrain.HW.HW3.queue.Queue;
import ru.geekbrain.HW.HW3.queue.QueueImpl;
import ru.geekbrain.HW.HW3.stack.Stack;
import ru.geekbrain.HW.HW3.stack.StackImpl;

public class MainHW3 {

    public static void main(String[] args) {
        String text = "qwertyuiop";
        revertText(text);
    }

    public static String revertText(String text) {
        StringBuilder bild = new StringBuilder();
        Stack<Character> stack = new StackImpl<>(text.length());
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            stack.push(currentChar);
        }
        System.out.println("original text= " + text);
        while ( !stack.isEmpty() ) {
            bild.append(stack.pop());
        }
        System.out.println("inverted text= " + bild);
        return bild.toString();
    }

    public static boolean addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }

}
