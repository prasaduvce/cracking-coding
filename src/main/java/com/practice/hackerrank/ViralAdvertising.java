package com.practice.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;

//https://www.hackerrank.com/challenges/strange-advertising?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=3-day-campaign
public class ViralAdvertising {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of days");
        int n = scanner.nextInt();

        Map<Integer, Integer> likedMap = new HashMap<>();
        for (int i = 0; i < n; i ++) {
            if ( i == 0) {
                likedMap.put(i, Math.floorDiv(5, 2));
                continue;
            }
            int temp = likedMap.get(i-1);
            likedMap.put(i, Math.floorDiv((temp*3), 2));
        }
        int likedDays = 0;
        likedDays = likedMap.values().stream().mapToInt(value -> value).sum();
        System.out.println("likedMap =====> "+likedMap);
        System.out.println("likedDays =====> "+likedDays);
    }
}
