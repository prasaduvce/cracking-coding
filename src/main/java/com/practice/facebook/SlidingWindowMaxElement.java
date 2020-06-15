package com.practice.facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SlidingWindowMaxElement {

    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 4, 6, 7, 1, 9, 8);
        List<Integer> maxElements = findMaxElement(nums, 3);
        System.out.println("maxElements ===> "+maxElements);
    }

    private static List<Integer> findMaxElement(List<Integer> nums, int k) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < (i + k); j++) {
                Set<Integer> integerSet = subSetOf(nums, i, j);
                ArrayList<Integer> integers = new ArrayList<>(integerSet);
                if (!integers.isEmpty()) {
                    resultList.add(integers.get(integers.size() - 1));
                }
            }
        }
        return resultList;
    }

    private static Set<Integer> subSetOf(List<Integer> nums, int startIndex, int endIndex) {
        Set<Integer> subset = new TreeSet<>();
        if (endIndex < nums.size()) {
            for (int i = startIndex; i <= endIndex; i++) {
                subset.add(nums.get(i));
            }
        }
        return subset;
    }

}
