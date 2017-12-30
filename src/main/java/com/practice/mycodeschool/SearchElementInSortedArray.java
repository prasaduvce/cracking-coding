package com.practice.mycodeschool;

public class SearchElementInSortedArray {

    public int find(int [] nums, int key) {
        int low = 0;
        int n = nums.length - 1;
        int high = n;

        while (low <= high) {
            int mid = (low+high)/2;
            if (key == nums[mid]) {
                return mid;
            }
            else if (nums[mid] <= nums[high]) {
                if  (key > nums[mid] && key <= nums[high]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            } else {
                if (key < nums[mid] && key >= nums[low]) {
                    high = mid  -1;
                } else {
                    low = mid+1;
                }
            }
        }

        return -1;
    }
}
