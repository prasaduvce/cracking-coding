package com.practice.designpatterns.structural.composite;

public class CompositePatternTest {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.addShape(new Circle());
		drawing.addShape(new Triangle());
		drawing.addShape(new Square());

		drawing.draw("Red");
		drawing.draw("Green");
	}
}
