package com.practice.designpatterns.structural.bridge;

public class BridgePatternTest {
	public static void main(String[] args) {
		Color red = new RedColor();
		Color green = new GreenColor();

		Shape circle = new Circle(red);
		Shape triangle = new Triangle(green);

		circle.applyColor(red);
		circle.applyColor(green);

		triangle.applyColor(red);
		triangle.applyColor(green);
	}
}
