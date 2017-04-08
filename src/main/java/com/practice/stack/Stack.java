package com.practice.stack;

import com.practice.common.ErrorMessages;

import java.lang.reflect.Array;

public class Stack<T> {

    int top = -1;

    int size;

    T stackArr[];

    int length;

    @SuppressWarnings("unchecked")
    public Stack(int size, Class<T> type) {
        this.size = size;
        this.stackArr = (T[]) Array.newInstance(type, size);
        this.length = 0;
    }

    public void push(T item) {
        if (top == this.size-1) {
            throw new RuntimeException(ErrorMessages.STACK_OVERFLOW_ERROR+this.size);
        }
        stackArr[++top] = item;
        this.length++;
    }

    public T pop() {
        if (top == -1) {
            throw new RuntimeException(ErrorMessages.STACK_UNDERFLOW_ERROR);
        }
        return stackArr[top--];
    }

    public void display() {
        if (top == -1) {
            throw new RuntimeException(ErrorMessages.STACK_EMPTY_ELEMENTS);
        }
        for (int i=top; i >=0; i--) {
            System.out.print(stackArr[i]);
            System.out.println("");
        }
    }

    public int getLength() {
        return this.length;
    }
}
