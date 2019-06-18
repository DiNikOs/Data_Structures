package ru.geekbrain.HW.HW3;

import ru.geekbrain.HW.HW3.queue.PriorityQueue;
import ru.geekbrain.HW.HW3.queue.Queue;
import ru.geekbrain.HW.HW3.queue.QueueImpl;
import ru.geekbrain.HW.HW3.stack.Stack;
import ru.geekbrain.HW.HW3.stack.StackImpl;

public class MainHW3 {

    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    private static void testQueue() {
        Queue<Integer> queue = new QueueImpl<>(5);
        //Queue<Integer> queue = new PriorityQueue<>(5);
        System.out.println(queue.insert(3));
        System.out.println(queue.insert(5));
        System.out.println(queue.insert(1));
        System.out.println(queue.insert(2));
        System.out.println(queue.insert(6));
        System.out.println(queue.insert(4));

        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is full: " + queue.isFull());

        while ( !queue.isEmpty() ) {
            System.out.println(queue.remove());
        }
    }

    private static void testStack() {
        Stack<Integer> stack = new StackImpl<>(5);

        addToStack(stack, 1);
        addToStack(stack, 2);
        addToStack(stack, 3);
        addToStack(stack, 4);
        addToStack(stack, 5);
        addToStack(stack, 6);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack top: " + stack.peek());

        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }

    public static boolean addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }
}
