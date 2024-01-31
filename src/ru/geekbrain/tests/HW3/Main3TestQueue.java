package ru.geekbrain.tests.HW3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.geekbrain.HW.HW3.MainHW3;
import ru.geekbrain.HW.HW3.queue.Queue;
import ru.geekbrain.HW.HW3.queue.QueueImpl;

public class Main3TestQueue {

    public static int SIZE = 5;
    MainHW3 main3;
    Queue<Integer> queue;

    @Before
    public void Init () {
        System.out.println("init");
        queue = new QueueImpl<>(SIZE);
        main3 = new MainHW3();
    }

    @Test
    public void TestIsEmpty() {
        Assert.assertEquals(true, queue.isEmpty());
        Assert.assertEquals(false, queue.isFull());
    }

    @Test
    public void TestIsFull() {
        for (int i = 0; i < SIZE; i++) {
            queue.insert(i);
        }
        Assert.assertEquals(false, queue.isEmpty());
        Assert.assertEquals(true, queue.isFull());
    }

    @Test
    public void TestQueueInsert() {
        int i;
        for (i = 0; i < SIZE; i++) {
            Assert.assertEquals(true, queue.insert(i));
        }
        Assert.assertEquals(false, queue.insert(i++));
    }

    @Test
    public void TestQueueSize() {
        for (int i = 0; i < SIZE; i++) {
            queue.insert(i);
        }
        Assert.assertEquals(SIZE, queue.size());
    }

    @Test
    public void TestQueueRemove() {
        int i = 0;
        while ( !queue.isEmpty() ) {
            ++i;
            Assert.assertEquals(java.util.Optional.of(i), queue.remove());
        }
    }

    @Test
    public void TestQueuePeek() {
        for (int i = 0; i < SIZE; i++) {
            queue.insert(i);
        }
        Assert.assertEquals(java.util.Optional.of(0), java.util.Optional.of(queue.peek()));
    }
}
