package com.practice;

public class CuttingTrees {
	public static void main(String[] args) {
		int a[] = {3, 4, 5, 4};
		System.out.println(numberOfWays(a));
	}

	private static int numberOfWays(int[] array) {
		int options = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				if (options != 0) {
					return 0;
				}
				if (i == 1 || array[i - 2] <= array[i]) {
					++options;
				}
				if (i == array.length - 1 || array[i - 1] <= array[i + 1]) {
					++options;
				}

			}
		}

		return options;
	}
}
