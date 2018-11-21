package com.practice.jdk8.durga.functions;

import java.util.function.Function;

public class StringFunction {
	public static void main(String[] args) {
		Function<String, Integer> stringLengthFunction = str -> str.length();
		Function<Integer, Integer> squareFunction = num -> (num * num);
		System.out.println(stringLengthFunction.apply("Hello User"));
		System.out.println("Square of 5 is "+squareFunction.apply(5));
	}
}
