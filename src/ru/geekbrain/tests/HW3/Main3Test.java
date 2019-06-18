package ru.geekbrain.tests.HW3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.geekbrain.HW.HW3.MainHW3;
import ru.geekbrain.HW.HW3.stack.Stack;
import ru.geekbrain.HW.HW3.stack.StackImpl;

import static org.junit.Assert.*;

public class Main3Test {


    public static int SIZE = 5;
    Stack<Integer> stack;// = new StackImpl<>(SIZE);
    MainHW3 main3;// = new MainHW3();


    @Before
    public void Init () {
        System.out.println("init");//
        stack = new StackImpl<>(SIZE);
        main3 = new MainHW3();
    }

    @Test
    public void TestIsEmpty() {
        Assert.assertEquals(true, stack.isEmpty());
        Assert.assertEquals(false, stack.isFull());
    }

    @Test
    public void TestIsFull() {
        for (int i = 0; i < SIZE; i++) {
            MainHW3.addToStack(stack, i);
        }
        Assert.assertEquals(false, stack.isEmpty());
        Assert.assertEquals(true, stack.isFull());
    }

    @Test
    public void TestStackAdd() {
        for (int i = 0; i < SIZE; i++) {
            Assert.assertEquals(true, MainHW3.addToStack(stack, i));
        }
    }

    @Test
    public void TestStackSize() {
        for (int i = 0; i < SIZE; i++) {
            MainHW3.addToStack(stack, i);
        }
        Assert.assertEquals(SIZE, stack.size());
    }

    @Test
    public void TestStackPop() {
        int i = SIZE;
        while ( !stack.isEmpty() ) {
           --i;
           System.out.println("i= " + i);
           Assert.assertEquals(java.util.Optional.of(i), stack.pop());
        }
    }

    @Test
    public void TestStackPeek() {
        for (int i = 0; i < SIZE; i++) {
            MainHW3.addToStack(stack, i);
        }
        Assert.assertEquals(java.util.Optional.of(SIZE), java.util.Optional.of(stack.peek()+1));
    }
}