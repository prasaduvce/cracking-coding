package com.practice.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String color) {
		shapes.forEach(shape -> {
			shape.draw(color);
		});
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	public void removeShape(Shape shape) {
		shapes.remove(shape);
	}

	public void clearShapes() {
		shapes.clear();
	}
}
