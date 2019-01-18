package com.practice;

public class NumberOfWays {
	public static void main(String[] args) {
		/*int [] a = new int[100000];

		for (int i=1;i<=100000;i++) {
			a[i-1] = i;
		}*/

		int [] a = {3,4,5,4};
		System.out.println(numberOfWays(a));
	}

	private static int numberOfWays(int[] A) {
		int optns = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] > A[i]) {
				if (optns != 0) {
					return 0;
				}
				if (i == 1 || A[i - 2] <= A[i]) {
					++optns;
				}
				if (i == A.length - 1 || A[i - 1] <= A[i + 1]) {
					++optns;
				}
				if (optns == 0) return 0;
			}
		}
		return optns == 0 ? A.length : optns;
	}
}
