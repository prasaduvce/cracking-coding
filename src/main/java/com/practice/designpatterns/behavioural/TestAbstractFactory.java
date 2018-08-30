package com.practice.designpatterns.behavioural;

public class TestAbstractFactory {
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PcComputerFactory("123", "456", "789"));
		Computer server = ComputerFactory.getComputer(new ServerComputerFactory("987", "654", "321"));
		System.out.println("pc ==> "+pc);
		System.out.println("server ===> "+server);

	}
}
