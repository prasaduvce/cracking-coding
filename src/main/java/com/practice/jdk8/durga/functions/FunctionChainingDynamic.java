package com.practice.jdk8.durga.functions;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingDynamic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username");
		String user = scanner.next();
		System.out.println("Enter password");
		String password = scanner.next();
		Function<String, String> extract = str -> str.substring(0, 5);
		Function<String, String> lowerCase = str -> str.toLowerCase();
		if (extract.andThen(lowerCase).apply(user).equals("durga")
			&& password.equals("java")) {
			System.out.println("User login is success");
		} else {
			System.out.println("User login failed");
		}
	}

}