package com.practice.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestFibonacciSubset {

    public static void main(String[] args) {
        List<List<Integer>> output = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        while (numberOfTests > 0) {
            int n = scanner.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i<n; i++) {
                nums[i] = scanner.nextInt();
            }
            output.add(findSubset(nums));
            numberOfTests--;
        }
        for(int i=0; i<output.size(); i++) {
            List<Integer> rowList = output.get(i);
            for (int j=0;j< rowList.size(); j++) {
                System.out.print(rowList.get(j)+" ");
            }
            System.out.println();
        }
    }

    private static List<Integer> findSubset(int[] arr) {
        OptionalInt maxNumber = Arrays.stream(arr).max();
        int max = maxNumber.getAsInt();
        List<Integer> fibonacciSeries = fibonacciSeries(max);
        List<Integer> subSetList = Arrays.stream(arr).filter(value -> fibonacciSeries.contains(value)).boxed().collect(
            Collectors.toList());
        return subSetList;
    }

    private static List<Integer> fibonacciSeries(int num) {
        List<Integer> series = new ArrayList<>();
        if (num == 0) {
            series.add(0);
            return series;
        }
        series.add(0);
        series.add(1);
        if (num == 1) {
            return series;
        }

        for (int i = 2; i < num; i++) {
            int prevSum = series.get(i - 1) + series.get(i - 2);
            series.add(prevSum);
            if (num == prevSum) {
                break;
            }
        }
        return series;
    }
}
