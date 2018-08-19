package com.practice.designpatterns.creational.factory;

public class SuperComputer implements Computer {
	@Override
	public String createdObject() {
		return "Created Super Computer";
	}
}
