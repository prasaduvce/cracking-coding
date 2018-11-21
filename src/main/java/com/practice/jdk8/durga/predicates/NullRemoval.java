package com.practice.jdk8.durga.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NullRemoval {
	public static void main(String[] args) {
		String [] names = {"Durga", "", null, "Ravi", "Shiva", null, " "};
		Predicate<Object> nonNullPredicate = obj -> obj != null && !obj.toString().trim().equals("");
		List<String> finalList = new ArrayList<>();
		for (String str: names) {
			if (nonNullPredicate.test(str)) {
				System.out.println("Non null or sot empty string: "+str);
				finalList.add(str);
			}
		}
		System.out.println("Non null/empty list ===> "+finalList);
	}
}
