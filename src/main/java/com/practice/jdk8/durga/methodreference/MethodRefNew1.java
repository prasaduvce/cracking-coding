package com.practice.jdk8.durga.methodreference;

public class MethodRefNew1 {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		MethodRefNew1 m1 = new MethodRefNew1();
		Runnable r = m1::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}