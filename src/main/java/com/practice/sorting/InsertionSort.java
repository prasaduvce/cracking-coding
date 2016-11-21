package com.practice.sorting;

import java.util.Scanner;

//FIXME: Logical Error.
public class InsertionSort {
	public static void main(String[] args) {
		int nums[] = new int[20];
		int n, temp, key;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in Array");
		n = scanner.nextInt();
		System.out.println("Enter array elements");
		for (int i=0; i<n; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("Un-sorted elements are");
		for (int i=0; i<n; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("Sorted elements are");
		for (int i=0; i<n;i++) {
			key = nums[i];
			for (int j=1; j<n-i; j++) {
				if (key > nums[j]) {
					temp = nums[j];
					nums[j] = key;

				}
			}
		}

	}
}
