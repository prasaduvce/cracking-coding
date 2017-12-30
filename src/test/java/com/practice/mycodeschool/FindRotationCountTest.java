package com.practice.mycodeschool;

import org.junit.Assert;
import org.junit.Test;

public class FindRotationCountTest {

    @Test
    public void test1() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        FindRotationCount findRotationCount = new FindRotationCount();
        int res = findRotationCount.find(nums);

        Assert.assertEquals(0, res);
    }

    @Test
    public void test2() {
        int nums[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};

        FindRotationCount findRotationCount = new FindRotationCount();
        int res = findRotationCount.find(nums);

        Assert.assertEquals(3, res);
    }

    @Test
    public void test3() {
        int nums[] = {7,1,2};

        FindRotationCount findRotationCount = new FindRotationCount();
        int res = findRotationCount.find(nums);

        Assert.assertEquals(1, res);
    }
}
