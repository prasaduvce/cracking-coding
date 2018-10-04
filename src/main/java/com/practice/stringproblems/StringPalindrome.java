package com.practice.stringproblems;

public class StringPalindrome {
	public static void main(String[] args) {
		String input = "prasadosan";
		char[] inputCharArray = input.toCharArray();
		for (int i=0,j=inputCharArray.length-1; i<j; i++, j--) {
			if (inputCharArray[i]  == inputCharArray[j]) {
				continue;
			}
			System.out.printf("String %s is not palindrome", input);
		}
		System.out.printf("String %s is palindorme", input);
	}
}
