package com.practice.codility.lessons;

import java.util.Scanner;

public class PrintStars {
	public static void main(String[] args) {
		int n;
		System.out.println("Number of rows to print?");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
