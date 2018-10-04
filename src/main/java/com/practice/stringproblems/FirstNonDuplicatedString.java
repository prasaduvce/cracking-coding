package com.practice.stringproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicatedString {
	public static void main(String[] args) {
		String input = "ohiogozymos";
		Map<String, Integer> charCountMap = new LinkedHashMap<>();
		for (Character ch : input.toCharArray()) {
			if (charCountMap.get(String.valueOf(ch)) == null) {
				charCountMap.put(String.valueOf(ch), 1);
			} else {
				Integer count = charCountMap.get(String.valueOf(ch));
				count++;
				charCountMap.put(String.valueOf(ch), count);
			}
		}

		System.out.println("charCountMap ===> "+charCountMap);
		charCountMap.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.findFirst()
				.ifPresent(characterIntegerEntry -> System.out.println("First non duplicated character "+characterIntegerEntry.getKey()));
	}
}
