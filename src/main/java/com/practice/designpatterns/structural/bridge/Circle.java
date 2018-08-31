package com.practice.designpatterns.structural.bridge;

import com.practice.designpatterns.structural.flyweight.ShapeType;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	void applyColor(Color color) {
		System.out.println("Drawing Circle with color ");
		color.applyColor();
	}
}
