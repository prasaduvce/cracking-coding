package com.practice.designpatterns.structural.bridge;

public abstract class Shape {

	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract void applyColor(Color color);
}
