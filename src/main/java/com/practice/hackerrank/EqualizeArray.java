package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//https://www.hackerrank.com/challenges/equality-in-a-array?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=30-day-campaign
public class EqualizeArray {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList();
		Map<Integer, Integer> numberCountMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = scanner.nextInt();
		System.out.println("Enter array elements separated by space");
		for (int i=0;i<n;i++) {
			nums.add(scanner.nextInt());
		}

		System.out.println("Below are array elements");
		for (int i=0;i<n;i++) {
			int count = 0;
			if (numberCountMap.containsKey(nums.get(i))) {
				int tempCount = numberCountMap.get(nums.get(i));
				numberCountMap.put(nums.get(i), ++tempCount);
			} else {
				numberCountMap.put(nums.get(i), ++count);
			}
		}
		int small = Collections.max(numberCountMap.values());
		int occurance = 0;
		int duplicate = 0;
		int duplicateValue = 0;
		int duplicateCount = 0;
		if (numberCountMap.size() == 1) {
			occurance = 0;
		} else if (numberCountMap.size() == 2) {
			Iterator<Map.Entry<Integer, Integer>> entryIterator = numberCountMap.entrySet().stream().iterator();
			Integer first = entryIterator.next().getValue();
			Integer second = entryIterator.next().getValue();

			if (first < second) {
				occurance = first;
			} else if (second < first) {
				occurance = second;
			} else {
				occurance = first;
			}
		}
		else {
			for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
				if (entry.getValue() == small) {
					duplicateValue = entry.getValue();
					duplicate++;
					continue;
				}
				if (entry.getValue() < small) {
					occurance = occurance+entry.getValue();
				}
			}
			if (duplicate == numberCountMap.size()) {
				occurance = numberCountMap.size() - 1;
			} else {
				duplicateCount = duplicateValue * (duplicate - 1);
			}
		}
		System.out.println("Min removal ===> "+(occurance+duplicateCount));
	}

	private Integer getMaxElement(Map<Integer, Integer> inputMap) {
		return Collections.max(inputMap.values());
	}
}
