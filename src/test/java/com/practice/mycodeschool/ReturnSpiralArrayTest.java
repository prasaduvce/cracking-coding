package com.practice.mycodeschool;

import org.junit.Assert;
import org.junit.Test;

public class ReturnSpiralArrayTest {

    @Test
    public void test1() {
        int [][] inputArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16} };
        Integer[] expectedArray = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
        ReturnSpiralArray returnSpiralArray = new ReturnSpiralArray();

        Integer[] res = returnSpiralArray.get(inputArray);

        Assert.assertArrayEquals(expectedArray, res);
    }

    @Test
    public void test2() {
        int [][] inputArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15} };
        Integer[] expectedArray = {1,2,3,6,9,12,15,14,13,10,7,4,5,8,11};
        ReturnSpiralArray returnSpiralArray = new ReturnSpiralArray();

        Integer[] res = returnSpiralArray.get(inputArray);

        Assert.assertArrayEquals(expectedArray, res);
    }

    @Test
    public void test3() {
        int [][] inputArray = {
                {1,2,3,4,5},
                {7,8,9,10,11},
                {12,13,14,15,16}};
        Integer[] expectedArray = {1,2,3,4,5,11,16,15,14,13,12,7,8,9,10};
        ReturnSpiralArray returnSpiralArray = new ReturnSpiralArray();

        Integer[] res = returnSpiralArray.get(inputArray);

        Assert.assertArrayEquals(expectedArray, res);
    }
}
