package com.practice.facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxValueOfIntString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        List<Long> maxNums = new ArrayList<>();
        for (int i=0;i<numberOfTests;i++) {
            String input = scanner.next();
            long maxValue = getMaxValue(input);
            maxNums.add(maxValue);
        }
        maxNums.forEach(integer -> System.out.println(integer));
    }

    private static long getMaxValue(String input) {
        long maxValue = input.charAt(0) - '0';
        for (int i=1;i<input.length();i++) {
            char ch = input.charAt(i);
            //int c = Integer.parseInt(String.valueOf(ch));
                if (ch == '0' || ch == '1' || maxValue < '2') {
                    maxValue = maxValue + (ch - '0');
                } else {
                    maxValue = maxValue * (ch - '0');
                }
            }
        return maxValue;
    }
}
