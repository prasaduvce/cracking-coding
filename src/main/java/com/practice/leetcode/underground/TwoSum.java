package com.practice.leetcode.underground;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        //int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        //int[] result = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        int[] result = twoSum.twoSum(new int[]{3, 3}, 6);
        System.out.println("result ====> "+ Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        int resIndex = 0;
        for (int i=0;i<nums.length; i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i]+nums[j] == target) {
                    res[resIndex++] = i;
                    res[resIndex++] = j;
                    break;
                }
            }
        }
        return res;
    }
}
