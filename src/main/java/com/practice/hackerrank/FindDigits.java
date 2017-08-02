package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/find-digits
//TODO: Find Java 8 way and minimize LOC
public class FindDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter test scenario count");
		int testScenarios = scanner.nextInt();
		System.out.println("Enter test data in new lines");
		int[] datas = new int[testScenarios];
		for (int i=0; i< testScenarios; i++) {
			datas[i] = scanner.nextInt();
		}
		List<Integer> counts = new ArrayList<>();
		for (int data : datas) {
			int count = 0;
			List<Integer> digits = getDigits(data);

			for (int digit : digits) {
				if (isDivisible(digit, data)) {
					count++;
				}
			}

			counts.add(count);
		}
		counts.forEach(integer -> System.out.println(integer));

	}

	private static List<Integer> getDigits(int num) {
		Stack<Integer> integers = new Stack<>();
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			integers.push(rem);
		}

		List<Integer> nums = new ArrayList<>();
		Iterator<Integer> stackIterator = integers.iterator();
		while (stackIterator.hasNext()) {
			nums.add(integers.pop());
		}

		//Integer[] objects = integers.toArray();
		return nums;
	}

	private static boolean isDivisible(int divisor, int dividend) {
		if (divisor == 0) {
			return false;
		}
		if (dividend%divisor == 0) {
			return true;
		}
		return false;
	}
}
