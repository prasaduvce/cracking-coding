package com.practice.jdk8.durga.primitivefunction;

import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class PrimitivePredicateTest {
	public static void main(String[] args) {
		IntPredicate predicate = i -> i % 2 == 0;

		int [] x = {0, 5, 10, 15, 20, 25};

		for (int x1 : x) {
			if (predicate.test(x1)) {
				System.out.println(x1 + " is even");
			}
		}

		IntFunction<Integer> f = i -> i* i;

		System.out.println("Square of 3 is "+f.apply(3));

		ToIntFunction<String> fun = str -> str.length();
		System.out.println("String lenght is "+fun.applyAsInt("durga"));

		IntToDoubleFunction f1 = i -> Math.sqrt(i);
		System.out.println(f1.applyAsDouble(16));

		IntUnaryOperator unaryOperator = i -> i * i;
		System.out.println(unaryOperator.applyAsInt(10));

		BinaryOperator<String> binaryOperator = (str1, str2) -> (str1+str2);
		System.out.println(binaryOperator.apply("str1", "str2"));
	}
}
