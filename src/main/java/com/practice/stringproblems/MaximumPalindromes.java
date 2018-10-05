package com.practice.stringproblems;

public class MaximumPalindromes {
	public static void main(String[] args) {
		//System.out.println(findLongestPalindrome("1234"));
		//System.out.println(findLongestPalindrome("12321"));
	//System.out.println(findLongestPalindrome("9912321456"));
		System.out.println(longestPalindrome("991233332145688888888888888"));
		//System.out.println(findLongestPalindrome("12145445499"));
		//System.out.println(findLongestPalindrome("1223213"));
		//System.out.println(findLongestPalindrome("abb"));
	}

	public static String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}

		if (s.length() == 1) {
			return s;
		}

		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			// get longest palindrome with center of i, i+1
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}

		return longest;
	}

	// Given a center, either one letter or two letter,
	// Find longest palindrome
	public static String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
}
