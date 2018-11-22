package com.practice.jdk8.durga.bifunction;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1 > num2;
		System.out.println(biPredicate.test(41, 5));

		BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1+num2;
		System.out.println(biFunction.apply(41, 5));

		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> System.out.println("Input numbers are "+num1 +","+num2);
		biConsumer.accept(41, 5);
	}
}
