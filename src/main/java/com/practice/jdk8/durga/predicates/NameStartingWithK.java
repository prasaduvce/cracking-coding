package com.practice.jdk8.durga.predicates;

import java.util.Arrays;
import java.util.function.Predicate;

public class NameStartingWithK {
	public static void main(String[] args) {
		String [] names = {"Sunny", "Kajol", "Mallika", "Katrina", "Kareena", "kumar"};
		Predicate<String> stringPredicate = str -> str.startsWith("k") || str.startsWith("K");
		Arrays.stream(names).filter(stringPredicate).forEach(str -> {
			System.out.println("Names starts with K is: "+str);
		});
	}
}
