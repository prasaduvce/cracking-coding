package com.practice.hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExtraLongFactorial {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		BigDecimal n = scanner.nextBigDecimal();
		BigDecimal res = factUsingIteration(n);
		System.out.println(res);
	}

	private static BigDecimal fact(BigDecimal n) {
		if (n.equals(BigDecimal.ONE)) {
			return BigDecimal.ONE;
		}
		return fact(n.subtract(BigDecimal.ONE)).multiply(n);
	}

	private static BigDecimal factUsingIteration(BigDecimal n) {
		BigDecimal res = BigDecimal.ONE;
		if (n.equals(BigDecimal.ZERO)) {
			return res;
		}
		for (BigDecimal i = BigDecimal.valueOf(2); (i.compareTo(n) == -1 || i.compareTo(n)==0); i=i.add(BigDecimal.ONE)) {
			res = res.multiply(i);
		}
		return res;
	}
}
