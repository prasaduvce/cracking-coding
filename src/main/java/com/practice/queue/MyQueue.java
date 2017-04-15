package com.practice.queue;


import java.lang.reflect.Array;

import static com.practice.common.ErrorMessages.EMPTY_QUEUE;
import static com.practice.common.ErrorMessages.QUEUE_UNDERFLOW;

public class MyQueue<T> {

    private int front;

    private int rear;

    private int length;

    private int size;

    private T[] queueArr;

    @SuppressWarnings("unchecked")
    public MyQueue(Class type, int size) {
        this.front = -1;
        this.rear = -1;
        this.length = 0;
        this.size = size;
        this.queueArr = (T[]) Array.newInstance(type, size);
    }

    private boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        return this.length;
    }

    public void enQueue(T item) {
        if (rear+1 >= size) {
            throw new RuntimeException("Queue overflow. Cannot allow item "+item +" in queue");
        }
        if (rear == -1) {
            front++;
            rear++;
            queueArr[rear] = item;
        } else {
            queueArr[++rear] = item;
        }
        System.out.println("Enqueued element "+item);
        length++;
    }

    public T deQueue() {
        T element;
        if (isEmpty()) {
            throw new RuntimeException(QUEUE_UNDERFLOW);
        } else {
            element = queueArr[front];
            length--;
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else
                front++;
        }
        System.out.println("De-queued element "+element);
        return element;
    }

    public void display() {
        if (size() == 0) {
            throw new RuntimeException(EMPTY_QUEUE);
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArr[i] + " ");
        }
    }
}
