package ru.geekbrain.tests.HW3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.geekbrain.HW.HW3.MainHW3;
import ru.geekbrain.HW.HW3.deQueue.DeQue;
import ru.geekbrain.HW.HW3.deQueue.DeQueImpl;

public class Main3TestDeQue {

    public static int SIZE = 5;
    MainHW3 main3;
    DeQue<Integer> deQueue;

    @Before
    public void Init () {
        System.out.println("init");
        deQueue = new DeQueImpl<>(SIZE);
        main3 = new MainHW3();
    }

    @Test
    public void TestIsEmpty() {
        Assert.assertEquals(true, deQueue.isEmpty());
        Assert.assertEquals(false, deQueue.isFull());
    }

    @Test
    public void TestIsFull() {
        for (int i = 0; i < SIZE; i++) {
            deQueue.insertLeft(i);
        }
        Assert.assertEquals(false, deQueue.isEmpty());
        Assert.assertEquals(true, deQueue.isFull());
    }

    @Test
    public void TestDeQueueInsertLeft() {
        int i;
        for (i = 0; i < SIZE; i++) {
            Assert.assertEquals(true, deQueue.insertLeft(i));
        }
        Assert.assertEquals(false, deQueue.insertLeft(i++));
    }

    @Test
    public void TestDeQueueInsertRight() {
        int i;
        for (i = 0; i < SIZE; i++) {
            Assert.assertEquals(true, deQueue.insertRight(i));
        }
        Assert.assertEquals(false, deQueue.insertRight(i++));
    }

    @Test
    public void TestQueueSize() {
        for (int i = 0; i < SIZE; i++) {
            deQueue.insertLeft(i);
        }
        Assert.assertEquals(SIZE, deQueue.size());
    }

    @Test
    public void TestDeQueueRemoveRight() {
        int i = 0;
        while ( !deQueue.isEmpty() ) {
            ++i;
            Assert.assertEquals(java.util.Optional.of(i), deQueue.removeRight());
        }
    }

    @Test
    public void TestDeQueueRemoveLeft() {
        int i = SIZE;
        while ( !deQueue.isEmpty() ) {
            --i;
            System.out.println("i= " + i);
            Assert.assertEquals(java.util.Optional.of(i), deQueue.removeLeft());
        }
    }
}
