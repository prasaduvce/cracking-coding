package com.practice.geek;

public class KadaneAlgo {
	public static void main(String[] args) {
		int [] nums = {-2, -3, 4, -1, -2, 1, 5, -3};

		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = Integer.MIN_VALUE;
		for (int num: nums) {
			max_ending_here = max_ending_here + num;
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
		}
		System.out.println(max_so_far);
	}
}
