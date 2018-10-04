package com.practice.stringproblems;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[] args) {
		String input = "prasadosan";
		char[] inputArray = input.toCharArray();
		System.out.println("Before reversing " + Arrays.toString(inputArray));
		for (int i = 0, j=inputArray.length-1; i < j; i++, j--) {
			char nthChar = inputArray[j];
			char temp = inputArray[i];
			inputArray[i] = nthChar;
			inputArray[j] = temp;
		}
		System.out.println("After reversing "+Arrays.toString(inputArray));
	}
}
