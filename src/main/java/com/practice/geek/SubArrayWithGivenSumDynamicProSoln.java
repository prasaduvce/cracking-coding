package com.practice.geek;

import java.util.Scanner;

public class SubArrayWithGivenSumDynamicProSoln {
	public static void main(String[] args) {
		System.out.println("Number of test cases?");
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		for (int i=0; i<testcases; i++ ) {
			System.out.println("Array Size");
			int arraySize = scanner.nextInt();
			System.out.println("Expected sum");
			int sum = scanner.nextInt();
			int[] a = new int[10000];

			System.out.println("Enter Array elements");
			for (int l = 0; l < arraySize; l++) {
				a[l] = scanner.nextInt();
			}

			int curSum = a[0];
			int start = 0;
			for (int j = 1; j <= arraySize; j++) {
				while (curSum > sum && start < j-1) {
					curSum = curSum - a[start];
					start++;
				}

				if (curSum == sum) {
					System.out.println("Start Index: "+(start+1));
					System.out.println("End Index: "+(j));
					System.exit(0);
				}

				if (j < arraySize) {
					curSum = curSum + a[j];
				}

			}
			System.out.println("NoSubArray");
		}
	}
}
