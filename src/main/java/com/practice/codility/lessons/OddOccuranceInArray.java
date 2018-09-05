package com.practice.codility.lessons;

import java.util.HashMap;
import java.util.Map;

public class OddOccuranceInArray {
	public static void main(String[] args) {
		int[] inputArray = {9, 3, 9, 3, 9, 7, 9, 9};
		Map<Integer, Integer> integerMap = new HashMap<>();

		for (int num : inputArray) {
			if (integerMap.get(num) == null) {
				integerMap.put(num, 1);
			} else {
				Integer count = integerMap.get(num);
				integerMap.put(num, ++count);
			}
		}

		integerMap.forEach((key, value) -> {
			if (value % 2 != 0) {
				System.out.println("Number " + key + " has odd occurance.");
			}
		});
	}
}
