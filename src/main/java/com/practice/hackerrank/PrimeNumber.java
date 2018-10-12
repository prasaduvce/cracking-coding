package com.practice.hackerrank;

import java.util.Arrays;

public class PrimeNumber {
	static boolean [] primes = new boolean[1000000];

	public static void main(String[] args) {
		int num = 56;
		setupPrime();
		System.out.println("Is "+ num +" Prime number ? "+isPrimeNumber(num));
	}

	private static void setupPrime() {
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		for (int i=2; i < primes.length; i++) {
			if (primes[i]) {
				for (int j=2;i*j<primes.length; j++) {
						primes[i*j] = false;
				}
			}
		}
	}

	private static boolean isPrimeNumber(int num) {
		return primes[num];
	}
}
