package com.practice.facebook;

public class FindTripletsWithZeroSum {

    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1, -4, 3};

        int n = nums.length;
        for (int i =0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1;k<n;k++) {
                    if (nums[i]+nums[j]+nums[k] == 0) {
                        System.out.println(nums[i] + ","+nums[j]+","+nums[k]);
                    }
                }
            }
        }
    }
}
