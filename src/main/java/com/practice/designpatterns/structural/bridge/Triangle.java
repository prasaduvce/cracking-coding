package com.practice.designpatterns.structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	void applyColor(Color color) {
		System.out.println("Drawing Triangle with color ");
		color.applyColor();
	}
}
