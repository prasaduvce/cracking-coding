package com.practice.timepass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramStringsCreator {
	static List<String> l = new ArrayList();

	public static void main(String[] args) {
		String testStr = "man";
		permuteString(testStr.toCharArray(), 0, testStr.length()-1);
		System.out.println(l);
	}

	static void permuteString(char str[], int i, int n) {
		if (i == n) {
			String replaceString = Arrays.toString(str)
					.replaceAll(",", "")
					.replaceAll(" ", "")
					.replaceAll("\\[", "")
					.replaceAll("\\]", "");
			l.add(replaceString
			);
		}
		for (int j = i; j <= n; j++) {
			swap(str, i, j);
			permuteString(str, i+1, n);
			swap(str, j, i);
		}
	}

	private static void swap(char[] str, int i, int j) {
		char temp = str[j];
		str[j] = str[i];
		str[i] = temp;
	}


}
