package com.practice.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] myArray = {2,4,6,8};
        int[] alicesArray = {1,7};
        mergeArrays(myArray, alicesArray);
        return;
    }

    private static int[] mergeArrays(int[] myArray, int[] alicesArray) {
        if (myArray.length == 0) {
            return alicesArray;
        }

        if (alicesArray.length == 0) {
            return myArray;
        }
        int[] mergedArray = new int[myArray.length+alicesArray.length];
        int i =0;
        int j = 0;
        int k = 0;
        while (i < myArray.length && j < alicesArray.length) {
            if (myArray[i] < alicesArray[j]) {
                mergedArray[k++] = myArray[i++];
            } else {
                mergedArray[k++] = alicesArray[j++];
            }
        }
        while (i < myArray.length) {
            mergedArray[k++] = myArray[i++];
        }

        while (j < alicesArray.length) {
            mergedArray[k++] = alicesArray[j++];
        }
        return mergedArray;
    }
}
