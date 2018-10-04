package com.practice.stringproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringPrintDuplicateChars {
	public static void main(String[] args) {
		String input = "prasadosannpr";
		Map<Character, Integer> stringIntegerMap = new HashMap<>();
		for (Character ch : input.toCharArray()) {
			if (stringIntegerMap.get(ch) == null) {
				stringIntegerMap.put(ch, 1);
			} else {
				Integer count = stringIntegerMap.get(ch);
				count++;
				stringIntegerMap.put(ch, count);
			}
		}
		System.out.println("Duplicate chars " + Arrays.toString(stringIntegerMap.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue() > 1).map(Map.Entry::getKey).toArray()));
	}
}
