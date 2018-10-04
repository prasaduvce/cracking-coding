package com.practice.stringproblems;

public class StringAnagram {
	public static void main(String[] args) {
		String str1 = "army";
		String str2 = "cary";

		if (str1.length() != str2.length()) {
			System.out.println("String are not anagram");
			return;
		}

		char[] str1Array = str1.toCharArray();
		for (char ch : str1Array) {
			int chIndex = str2.indexOf(ch);
			if (chIndex != -1) {
				str2 = str2.substring(0, chIndex)+str2.substring(chIndex+1);
			} else {
				System.out.println("String are not anagram");
				return;
			}
		}
		System.out.println("Strings are anagram");
	}
}
