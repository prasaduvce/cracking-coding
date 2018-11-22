package com.practice.jdk8.durga.methodreference;

public class MethodReferenceTest {
	public static void main(String[] args) {
		Interf i = () -> {System.out.println("Say hello");
		;;;;;
		};

		Interf i1 = MethodReferenceTest::m2;
		i1.m1();
	}

	static void m2() {
		System.out.println("Method referencing");
	}
}

interface Interf {
	void m1();
}
