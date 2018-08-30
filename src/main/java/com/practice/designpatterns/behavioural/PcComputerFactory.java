package com.practice.designpatterns.behavioural;

public class PcComputerFactory implements ComputerAbstractFactory{

	private String ram;
	private String cpu;
	private String hdd;

	public PcComputerFactory(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public Computer createComputer() {
		return new Pc(this.ram, this.hdd, this.cpu);
	}
}
