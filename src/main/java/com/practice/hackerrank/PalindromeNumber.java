package com.practice.hackerrank;

public class PalindromeNumber {
	public static void main(String[] args) {
		//checkPalindromeConventional(-232);
		checkPalindromeString("gaag");
	}

	private static void checkPalindromeConventional(int number) {
		int tempNumber = number;
		int reverseNumber = 0;
		int remainder = 0;
		while (number > 0) {
			remainder = number % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Input number ===> "+number);
		System.out.println("reverseNumber ===> "+reverseNumber);
		if (tempNumber == reverseNumber) {
			System.out.println("Number "+tempNumber+" is palindrome.");
		} else {
			System.out.println("Number "+tempNumber+" is not palindrome.");
		}
	}

	private static void checkPalindromeString(String str) {
		int i = 0;
		int j = str.length()-1;

		while (i <= j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				System.out.println("String "+str+" is not palindrome.");
				return;
			}
		}
		System.out.println("String "+str+" is palindrome.");

	}
}
