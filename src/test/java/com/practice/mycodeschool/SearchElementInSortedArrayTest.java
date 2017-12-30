package com.practice.mycodeschool;

import org.junit.Assert;
import org.junit.Test;

public class SearchElementInSortedArrayTest {
    @Test
    public void test1() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        SearchElementInSortedArray findRotationCount = new SearchElementInSortedArray();
        int res = findRotationCount.find(nums, 3);

        Assert.assertEquals(2, res);
    }

    @Test
    public void test2() {
        int nums[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};

        SearchElementInSortedArray findRotationCount = new SearchElementInSortedArray();
        int res = findRotationCount.find(nums, 3);

        Assert.assertEquals(5, res);
    }

    @Test
    public void test3() {
        int nums[] = {7,1,2};

        SearchElementInSortedArray findRotationCount = new SearchElementInSortedArray();
        int res = findRotationCount.find(nums, 2);

        Assert.assertEquals(2, res);
    }

}
