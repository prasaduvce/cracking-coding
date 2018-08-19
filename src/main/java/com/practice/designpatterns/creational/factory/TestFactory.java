package com.practice.designpatterns.creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		System.out.println(ComputerFactory.createComputer(ComputerType.PC).createdObject());
		System.out.println(ComputerFactory.createComputer(ComputerType.MINI_COMPUTER).createdObject());
		System.out.println(ComputerFactory.createComputer(ComputerType.SUPER_COMPUTER).createdObject());
	}
}
