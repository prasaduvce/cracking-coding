package com.practice.designpatterns.behavioural;

public class ServerComputerFactory implements ComputerAbstractFactory{

	private String ram;
	private String hdd;
	private String cpu;

	public ServerComputerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(this.ram, this.hdd, this.cpu);
	}
}
