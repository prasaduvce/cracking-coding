package com.practice.stringproblems;

public class StringReverseRecrusively {
	public static void main(String[] args) {
		String input = "prasadosan";
		System.out.println("Before reversing " +input);
		System.out.println("After reversing "+reverse(input));
	}

	private static String reverse(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
}
