package com.practice.mycodeschool;

//https://www.youtube.com/watch?v=4qjprDkJrjY&index=3&list=PL2_aWCzGMAwLPEZrZIcNEq9ukGWPfLT4A
public class FindRotationCount {

    public int find(int [] nums) {
        int low = 0;
        int n = nums.length -1;
        int high = n;

        while (low <= high) {
            if (nums[low] <= nums[high]) {
                return low;
            }
            int mid = (low + high) / 2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if (nums[mid] <= nums[prev]
                    && nums[mid] <= nums[next] ) {
                return mid;
            }
            else if (nums[mid] <= nums[high]) {
                high = mid-1;
            } else  if (nums[mid] >= nums[low]) {
                low = mid+1;
            }
        }
        return -1;
    }
}
