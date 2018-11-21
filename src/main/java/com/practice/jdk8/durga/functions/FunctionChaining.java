package com.practice.jdk8.durga.functions;

import java.util.function.Function;

public class FunctionChaining {
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		System.out.println(f1.apply("Aishwaryaabhi"));
		System.out.println(f2.apply("Aishwaryaabhi"));
		System.out.println(f1.andThen(f2).apply("Aishwaryaabhi"));
		System.out.println(f1.compose(f2).apply("Aishwaryaabhi"));

		Function<Integer, Integer> f1new = i -> i + i;
		Function<Integer, Integer> f2new = i -> i * i * i;
		System.out.println(f1new.andThen(f2new).apply(2));
		System.out.println(f1new.compose(f2new).apply(2));
	}

}