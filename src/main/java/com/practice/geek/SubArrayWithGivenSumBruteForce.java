package com.practice.geek;

import java.util.Scanner;

public class SubArrayWithGivenSumBruteForce {
	public static void main(String[] args) {
		System.out.println("Number of test cases?");
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		for (int i=0; i<testcases; i++ ) {
			int arraySize = scanner.nextInt();
			int expectedSum = scanner.nextInt();
			int[] a = new int[10000];

			for (int l=0;l<arraySize;l++) {
				a[l] = scanner.nextInt();
			}


			int startIndex = 0;
			int endIndex = 0;
			for (int j=0;j<arraySize;j++) {
				startIndex = j;
				int sum = a[j];
				for (int k=j+1;k<=arraySize;k++) {
					if (sum == expectedSum) {
						System.out.println("Start Index: "+(startIndex+1)+", End Index: "+(endIndex+1));
						System.exit(0);
					}
					if (sum > expectedSum || k == arraySize) {
						break;
					}
					endIndex = k;
					sum = sum+a[k];
				}
			}

		}
	}
}
