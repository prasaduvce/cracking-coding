package com.practice.sorting;

import java.util.Scanner;


//TODO: Analyze the time and space complexity
//Time Complexity: O(n Square)
//Space Complexity: O(n)
public class BubbleSort {

	public static void main(String[] args) {
		int[] num = new int[20];
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = scanner.nextInt();
		System.out.println("enter array elements one by one");
		for (int i=0; i<n; i++) {
			num[i] = scanner.nextInt();
		}
		System.out.println("Unsorted array elements below");
		for (int i=0; i<n; i++) {
			System.out.println(num[i]);
		}
		for (int i=0; i<n; i++) {
			for (int j=1; j<n-i;j++) {
				if (num[j-1] > num[j]) {
					temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Sorted array elements below");
		for (int i=0; i<n; i++) {
			System.out.println(num[i]);
		}
	}


}
