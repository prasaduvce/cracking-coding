package com.practice.jdk8.durga.suppliers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		Supplier<String> s = () -> {
			String [] s1 = {"sunny", "bunny", "chinnny", "vinny", "dinny"};
			int x = (int)(Math.random()*4);
			return s1[x];
		};

		System.out.println(s.get());

	}
}
