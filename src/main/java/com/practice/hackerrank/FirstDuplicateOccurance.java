package com.practice.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateOccurance {

	public Character find(String input) {
		Set<Character> processedSet = new HashSet<>();

		char[] chars = input.toCharArray();
		for (Character ch : chars) {
			if (!processedSet.add(ch)) {
				return ch;
			}
		}
		return null;
	}
}
