package com.practice.stack;

import org.junit.Assert;
import org.junit.Test;

import static com.practice.common.ErrorMessages.STACK_OVERFLOW_ERROR;
import static com.practice.common.ErrorMessages.STACK_UNDERFLOW_ERROR;

public class StackTest {

    @Test
    public void testPush() {
        Stack<Integer> stack = new Stack<>(2, Integer.class);
        stack.push(1);
        stack.push(2);

        try {
            stack.push(3);
        } catch (RuntimeException e) {
            Assert.assertEquals(e.getMessage(), STACK_OVERFLOW_ERROR + "2");
            Assert.assertEquals(2, stack.getLength());
        } catch (Exception e) {
            Assert.fail("RuntimeException expected");
        }
    }

    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<>(2, Integer.class);
        stack.push(1);
        stack.push(2);
        Integer topElement = stack.pop();
        Assert.assertEquals(new Integer(2), topElement);
        topElement = stack.pop();
        Assert.assertEquals(new Integer(1), topElement);

        try {
            stack.pop();
        } catch (RuntimeException e) {
            Assert.assertEquals(STACK_UNDERFLOW_ERROR, e.getMessage());
        }
    }

    @Test
    public void testDisplay() {
        Stack<Integer> stack = new Stack<>(5, Integer.class);
        stack.push(21);
        stack.push(23);
        stack.push(31);
        stack.push(45);
        stack.push(56);
        stack.display();
    }
}
