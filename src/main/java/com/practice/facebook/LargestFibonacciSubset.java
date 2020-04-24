package com.practice.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class LargestFibonacciSubset {

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 9, 10, 13, 7};

        OptionalInt maxNumber = Arrays.stream(arr).max();
        int max = maxNumber.getAsInt();
        List<Integer> fibonacciSeries = fibonacciSeries(max);
        System.out.println("fibonacciSeries ===> "+fibonacciSeries);
        List<Integer> subSetList = Arrays.stream(arr).filter(value -> fibonacciSeries.contains(value)).boxed().collect(
            Collectors.toList());
        System.out.println(subSetList);
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
