package ru.geekbrain.tests.HW3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.geekbrain.HW.HW3.MainHW3;
import ru.geekbrain.HW.HW3.stack.Stack;
import ru.geekbrain.HW.HW3.stack.StackImpl;

public class TestHW3_2 {

    private final String text = "qwertyuiop";
    public static int SIZE;
    Stack<Integer> stack;
    MainHW3 main3;

    @Before
    public void Init () {
        System.out.println("init");
        SIZE = text.length();
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
    public void TestRevertText() {
        Assert.assertEquals("poiuytrewq", MainHW3.revertText(text));
    }

}
