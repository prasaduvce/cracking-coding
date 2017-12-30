package com.practice.mycodeschool;

import org.junit.Assert;
import org.junit.Test;

public class CountOccuranceTest {

    @Test
    public void testCase1() {
        int [] nums = {1, 2, 3, 4, 10, 10, 10, 11, 12};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 10);

        Assert.assertEquals(3, count);
    }

    @Test
    public void testCase2() {
        int [] nums = {1, 2, 3, 9, 9, 9, 9, 11, 12};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 9);

        Assert.assertEquals(4, count);
    }

    @Test
    public void testCase3() {
        int [] nums = {9, 9, 9, 9, 9, 9, 9, 11, 12};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 9);

        Assert.assertEquals(7, count);
    }

    @Test
    public void testCase4() {
        int [] nums = {9, 9, 10};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 10);

        Assert.assertEquals(1, count);
    }

    @Test
    public void testCase5() {
        int [] nums = {1, 9, 9, 10, 11};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 11);

        Assert.assertEquals(1, count);
    }

    @Test
    public void testCase11() {
        int [] nums = {1, 2, 3, 4, 10, 10, 10, 11, 12};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 1);

        Assert.assertEquals(1, count);
    }

    @Test
    public void testCase12() {
        int [] nums = {1, 2, 3, 9, 9, 9, 9, 11, 12};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 1);

        Assert.assertEquals(1, count);
    }


    @Test
    public void testCase13() {
        int [] nums = {9, 9, 9, 9, 9, 9, 9};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 9);

        Assert.assertEquals(7, count);
    }


    @Test
    public void testCase14() {
        int [] nums = {9, 9, 10};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 9);

        Assert.assertEquals(2, count);
    }

    @Test
    public void testCase15() {
        int [] nums = {1, 9, 9, 10, 11};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 1);

        Assert.assertEquals(1, count);
    }

    @Test
    public void testCase16() {
        int [] nums = {1, 9, 9, 10, 11};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 13);

        Assert.assertEquals(0, count);
    }

    @Test
    public void testCase17() {
        int [] nums = {1};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 1);

        Assert.assertEquals(1, count);
    }

    @Test
    public void testCase18() {
        int [] nums = {1, 1, 1, 1, 1};

        CountOccurance findOccurance = new CountOccurance();
        int count = findOccurance.count(nums, 2);

        Assert.assertEquals(0, count);
    }
}
