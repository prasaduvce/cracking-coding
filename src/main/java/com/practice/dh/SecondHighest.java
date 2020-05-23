package com.practice.dh;

public class SecondHighest {

    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 1, 4, 2};
        System.out.println("Second big ===> "+new SecondHighest().findSecondHighest(nums));
    }

    private int findSecondHighest(int[] nums) {
        int big = Integer.MIN_VALUE;
        int secondBig = Integer.MIN_VALUE;
        int count = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]>big) {
                secondBig = big;
                big = nums[i];
            } else if (nums[i] > secondBig && nums[i]!=big) {
                secondBig = nums[i];
            }
        }
        return secondBig;
    }
}
