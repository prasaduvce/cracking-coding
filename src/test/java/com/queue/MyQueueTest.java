package com.queue;

import com.practice.common.ErrorMessages;
import com.practice.queue.MyQueue;
import org.junit.Assert;
import org.junit.Test;

import static com.practice.common.ErrorMessages.QUEUE_UNDERFLOW;

public class MyQueueTest {

    @Test
    public void testEnqueue() {
        MyQueue<Integer> myQueue = new MyQueue(Integer.class, 3);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);

        Assert.assertEquals(3, myQueue.size());
        myQueue.display();
    }

    @Test
    public void testEnqueueQueueFull() {
        MyQueue<Integer> myQueue = new MyQueue(Integer.class, 2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        try {
            myQueue.enQueue(5);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("Queue overflow. Cannot allow item 5 in queue", e.getMessage());
        }
        Assert.assertEquals(2, myQueue.size());
        myQueue.display();
    }

    @Test
    public void testDequeue() {
        MyQueue<Integer> myQueue = new MyQueue(Integer.class, 4);
        myQueue.enQueue(31);
        myQueue.enQueue(14);
        myQueue.enQueue(21);
        myQueue.enQueue(53);

        Assert.assertEquals(Integer.valueOf(31), myQueue.deQueue());
        Assert.assertEquals(Integer.valueOf(14), myQueue.deQueue());
        Assert.assertEquals(Integer.valueOf(21), myQueue.deQueue());
        Assert.assertEquals(Integer.valueOf(53), myQueue.deQueue());
    }

    @Test
    public void testDequeueUnderflow() {
        MyQueue<Integer> myQueue = new MyQueue(Integer.class, 4);
        myQueue.enQueue(31);
        myQueue.enQueue(14);
        myQueue.enQueue(25);
        myQueue.enQueue(67);

        Assert.assertEquals(Integer.valueOf(31), myQueue.deQueue());
        Assert.assertEquals(Integer.valueOf(14), myQueue.deQueue());
        Assert.assertEquals(Integer.valueOf(25), myQueue.deQueue());
        Assert.assertEquals(Integer.valueOf(67), myQueue.deQueue());
        try {
            myQueue.deQueue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(QUEUE_UNDERFLOW, e.getMessage());
        }
    }

    @Test
    public void testEnqueuAndDequeue() {
        MyQueue<Integer> myQueue = new MyQueue(Integer.class, 10);
        myQueue.enQueue(31);
        myQueue.enQueue(14);

        Assert.assertEquals(Integer.valueOf(31), myQueue.deQueue());
        Assert.assertEquals(Integer.valueOf(14), myQueue.deQueue());
        myQueue.enQueue(56);
        Assert.assertEquals(Integer.valueOf(56), myQueue.deQueue());
    }
}
