package com.practice.designpatterns.creational.factory;

public class ComputerFactory {

	public static Computer createComputer(ComputerType type) {
		Computer computer;
		switch (type) {
			case PC:
				computer = new Pc();
				break;
			case MINI_COMPUTER:
				computer = new MiniComputer();
				break;
			case SUPER_COMPUTER:
				computer = new SuperComputer();
				break;
			default:
				computer = null;
		}
		return computer;
	}
}
