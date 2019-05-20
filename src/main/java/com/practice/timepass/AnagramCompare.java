package com.practice.timepass;

import java.util.List;
import java.util.stream.Collectors;

public class AnagramCompare {
	public static void main(String[] args) {
		String str1 = "relay";
		String str2 = "leray";

		List<Character> str1Chars = str1.chars().mapToObj(value -> (char) value).collect(Collectors.toList());
		int str2Sum = str2.chars().sum();

		System.out.println("str1Chars ===> "+str1Chars + ", str2Sum ===> "+str2Sum);
	}
}
