package com.practice.zalando;

import java.util.Arrays;

public class Codility2_New {

    public static void main(String[] args) {

        Codility2_New codility2 = new Codility2_New();
        //int [] A = {4, -1, 0, 3};
        //int [] B = {-2, 5, 0, 3};
        //int [] A = {2, -2, -3, 3};
        //int [] B = {0, 0, 4, -4};
        //int [] A = {4, -1, 0, 3};
        //int [] B = {-2, 6, 0, 4};
        //int [] A = {3, 2, 6};
        //int [] B = {4, 1, 6};
        int [] A = {1, 4, 2, -2, 5};
        int [] B = {7, -2, -2, 2 ,5};
        System.out.println("Solution ==> "+codility2.solution(A, B));


    }

    public int solution(int[] A, int[] B) {
        int fairIndex = 0;
        int midIndex = 0;
        for (int i=0;i<A.length;i++) {
            //int sumOfArrayA = getSumOfArray(A, i);
            int[] subArrayALeft = getSubArray(A, 0, midIndex);
            int[] subArrayARight = getSubArray(A, midIndex+1, A.length-1);
            int[] subArrayBLeft = getSubArray(B, 0, midIndex);
            int[] subArrayBRight = getSubArray(B, midIndex+1, B.length-1);
            System.out.println("subArrayALeft ==> "+Arrays.toString(subArrayALeft));
            System.out.println("subArrayARight ==> "+Arrays.toString(subArrayARight));
            System.out.println("subArrayBLeft ==> "+Arrays.toString(subArrayBLeft));
            System.out.println("subArrayBRight ==> "+Arrays.toString(subArrayBRight));
            int sumOfArrayALeft = Arrays.stream(subArrayALeft).sum();
            int sumOfArrayARight = Arrays.stream(subArrayARight).sum();
            int sumOfArrayBLeft = Arrays.stream(subArrayBLeft).sum();
            int sumOfArrayBRight = Arrays.stream(subArrayBRight).sum();
            //int sumOfArrayB = getSumOfArray(B, i);
            if ((sumOfArrayALeft == sumOfArrayARight) && (sumOfArrayALeft == sumOfArrayBLeft) && (sumOfArrayALeft
                == sumOfArrayBRight) && subArrayALeft.length > 0 && subArrayARight.length > 0 && subArrayBLeft.length > 0
                && subArrayBRight.length > 0) {
                fairIndex++;
            }
            midIndex++;
        }
        return fairIndex;
    }

    private int getSumOfArray(int[] arr, int startIndex) {
        int sum = 0;
        for (int i=startIndex; i<arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }

    private int[] getSubArray(int[] arr, int startIndex, int endIndex) {
        int subArrayLength = arr.length - startIndex;
        int [] subArray = new int[subArrayLength];
        int subArrayIndex = 0;
        for (int i=startIndex;i<=endIndex;i++) {
            subArray[subArrayIndex++] = arr[startIndex++];
        }
        return subArray;
    }

    private int[] getSubArrayOld(int[] arr, int startIndex) {
        if (startIndex == 0) {
            int [] subArray = new int [1];
            subArray[0] = arr[0];
            return subArray;
        }
        int subArrayLength = arr.length - startIndex;
        int [] subArray = new int[subArrayLength];
        for (int i=0;i<subArrayLength;i++) {
            subArray[i] = arr[startIndex];
            startIndex++;
        }
        return subArray;
    }

    private int arraySum(int[] arr) {
        return Arrays.stream(arr).sum();
        /*int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum;*/
    }

}
