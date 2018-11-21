package com.practice.jdk8.durga.suppliers;

import java.util.function.Supplier;

public class OtpGeneratorSupplier {
	public static void main(String[] args) {
		Supplier<String> stringSupplier = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println("Otp1 "+ stringSupplier.get());
		System.out.println("Otp2 "+ stringSupplier.get());
		System.out.println("Otp3 "+ stringSupplier.get());
		System.out.println("Otp4 "+ stringSupplier.get());
		System.out.println("Otp5 "+ stringSupplier.get());
	}
}
