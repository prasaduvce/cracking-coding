package com.practice.jdk8.durga.suppliers;

import java.util.function.Supplier;

public class RandomPasswordSupplier {
	public static void main(String[] args) {
		Supplier<String> passwordGenerator = () -> {
			String pwd = "";

			Supplier<Integer> d = () -> (int) (Math.random()*10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$#";
			Supplier<Character> c = () -> {
				int i = (int) (Math.random() * 29);
				return symbols.charAt(i);
			};
			for (int i=1; i<=8; i++) {
				if (i % 2 == 0) {
					pwd = pwd + d.get();
				} else {
					pwd = pwd + c.get();
				}
			}
			return pwd;
		};
		System.out.println("Random password generator ==> "+passwordGenerator.get());
	}
}
