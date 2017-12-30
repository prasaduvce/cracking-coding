package com.practice.mycodeschool;

public class CountOccurance {

    public int count(int [] nums, int key) {
        FindOccurance findOccurance = new FindOccurance();
        int firstIndex = findOccurance.findFirstIndex(nums, key);
        int lastIndex = findOccurance.findLastIndex(nums, key);

        if (firstIndex == -1
                || lastIndex == -1) {
            return 0;
        }

        return (lastIndex - firstIndex)+1;
    }
}
