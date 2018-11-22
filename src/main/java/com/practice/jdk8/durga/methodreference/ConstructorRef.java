package com.practice.jdk8.durga.methodreference;

public class ConstructorRef {
	public static void main(String[] args) {
		InterfNew i = Sample::new;
		i.get();
	}
}

class Sample {
	Sample() {
		System.out.println("Sample constructor execution object creation");
	}
}

interface InterfNew {
	Sample get();
}