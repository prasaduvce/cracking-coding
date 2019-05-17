package com.practice.timepass;

import java.util.Arrays;

public class AnagramCompare {
	public static void main(String[] args) {
		String str1 = "relay";
		String str2 = "leray";

		int str1Sum = str1.chars().sum();
		int str2Sum = str2.chars().sum();

		System.out.println("str1Sum ===> "+str1Sum + ", str2Sum ===> "+str2Sum);
	}
}
