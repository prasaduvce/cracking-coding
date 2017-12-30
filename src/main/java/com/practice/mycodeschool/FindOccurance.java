package com.practice.mycodeschool;

public class FindOccurance {

    public int findFirstIndex(int [] inArr, int num) {
        int result = -1;
        int low = 0;
        int high = inArr.length-1;

        while (low <= high) {
            int mid = (low+high) / 2;
            if (num == inArr[mid]) {
                result = mid;
                high = mid-1;
            } else if (num > inArr[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return result;
    }

    public int findLastIndex(int [] inArr, int num) {
        int result = -1;
        int low = 0;
        int high = inArr.length-1;

        while (low <= high) {
            int mid = (low+high) / 2;
            if (num == inArr[mid]) {
                result = mid;
                low = mid+1;
            } else if (num > inArr[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return result;
    }
}
