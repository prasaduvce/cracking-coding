package com.practice.mycodeschool;

import org.junit.Assert;
import org.junit.Test;

public class FindOccuranceTest {

    @Test
    public void testCase1() {
        int [] nums = {1, 2, 3, 4, 10, 10, 10, 11, 12};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findFirstIndex(nums, 10);

        Assert.assertEquals(4, firstIndex);
    }

    @Test
    public void testCase2() {
        int [] nums = {1, 2, 3, 9, 9, 9, 9, 11, 12};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findFirstIndex(nums, 9);

        Assert.assertEquals(3, firstIndex);
    }

    @Test
    public void testCase3() {
        int [] nums = {9, 9, 9, 9, 9, 9, 9, 11, 12};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findFirstIndex(nums, 9);

        Assert.assertEquals(0, firstIndex);
    }

    @Test
    public void testCase4() {
        int [] nums = {9, 9, 10};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findFirstIndex(nums, 9);

        Assert.assertEquals(0, firstIndex);
    }

    @Test
    public void testCase5() {
        int [] nums = {1, 9, 9, 10, 11};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findFirstIndex(nums, 9);

        Assert.assertEquals(1, firstIndex);
    }

    @Test
    public void testCase11() {
        int [] nums = {1, 2, 3, 4, 10, 10, 10, 11, 12};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findLastIndex(nums, 10);

        Assert.assertEquals(6, firstIndex);
    }

    @Test
    public void testCase12() {
        int [] nums = {1, 2, 3, 9, 9, 9, 9, 11, 12};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findLastIndex(nums, 9);

        Assert.assertEquals(6, firstIndex);
    }


    @Test
    public void testCase13() {
        int [] nums = {9, 9, 9, 9, 9, 9, 9, 11, 12};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findLastIndex(nums, 9);

        Assert.assertEquals(6, firstIndex);
    }


    @Test
    public void testCase14() {
        int [] nums = {9, 9, 10};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findLastIndex(nums, 9);

        Assert.assertEquals(1, firstIndex);
    }

    @Test
    public void testCase15() {
        int [] nums = {1, 9, 9, 10, 11};

        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findLastIndex(nums, 9);

        Assert.assertEquals(2, firstIndex);
    }
}
