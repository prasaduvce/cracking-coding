package com.practice.geek;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class MissingNumber {
	public static void main(String[] args) {
		int[] missingNumbers = new int[Integer.MAX_VALUE];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Test case count ??");
		int testCaseCount = scanner.nextInt();
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println("Array size???");
			int arraySize = scanner.nextInt();
			//to consume new line
			scanner.nextLine();
			System.out.println("Enter array elements separated by space");
			String numString = scanner.nextLine();
			String[] split = numString.split(" ");

			int sumOfArray = Arrays.stream(split).map(Integer::valueOf).reduce(0, (integer, integer2) -> integer + integer2);

			int expectedSum = (arraySize * (arraySize + 1)) / 2;


			missingNumbers[i] =  (expectedSum - sumOfArray);
		}

		for (int i=0;i<missingNumbers.length;i++) {
			if (missingNumbers[i] == 0) {
				continue;
			}
			System.out.println("missingNumbers ===> "+missingNumbers[i]);
		}
	}
}
