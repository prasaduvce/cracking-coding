package com.practice.facebook;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

public class PairsWithDiffEqualTo {

    public static void main(String[] args) {
        int[] arr = {8, 12, 16, 4, 0, 20};
        int diff = 4;
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();

        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (Math.abs(arr[i]-arr[j]) == diff) {
                    pairs.add(new Pair<>(arr[i], arr[j]));
                }
            }
        }

        System.out.println("pairs ===> "+pairs);
    }
}
