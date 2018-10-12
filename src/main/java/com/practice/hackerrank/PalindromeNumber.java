package com.practice.hackerrank;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = -232;
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
}
