package com.practice.codility.lessons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SmallestPositiveNumberGreaterThanZero {
	public static void main(String[] args) {
		//int nums[] = {1, 3, 6, 4, 1, 2};
		int nums[] = {1, 2, 3};
		//int nums[] = {-1, -3};
		List<Integer> integers = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Optional<Integer> minOptional = integers.stream().min(Comparator.comparingInt(value -> value));

		System.out.println("min ==> "+minOptional.get());

		Integer min = minOptional.get();

		//small++;
		//System.out.println("Next po");
		if (min < 0) {
			min = 1;
		} else {
			for (int num : nums) {
				if (isNumExists(integers, min)) {
					++min;

				}
			}
		}
		System.out.println("Next positive integer greater than zero: "+min);
	}

	static boolean isNumExists(List<Integer> integers, int num) {
		return integers.stream().anyMatch(integer -> integer == num);
	}
}
