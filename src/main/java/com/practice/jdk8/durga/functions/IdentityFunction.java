package com.practice.jdk8.durga.functions;

import java.util.function.Function;

public class IdentityFunction {
	public static void main(String[] args) {
		Function<String, String> f = Function.identity();
		System.out.println(f.apply("durga"));
	}
}
