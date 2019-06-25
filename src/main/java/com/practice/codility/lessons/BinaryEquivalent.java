package com.practice.codility.lessons;

public class BinaryEquivalent {
	public static void main(String[] args) {
		int [] a = {0, 0, 0, 0, 0};
		System.out.println(solution(a));
	}

	private static int solution(int [] a) {
		int sum = 0;
		for (int n : a) {
			sum = sum + (int)Math.pow(2, n);
		}
		return sum;
	}
}
