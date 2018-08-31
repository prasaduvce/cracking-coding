package com.practice.designpatterns.structural.flyweight;

import static com.practice.designpatterns.structural.flyweight.ShapeType.CIRCLE;
import static com.practice.designpatterns.structural.flyweight.ShapeType.RECTANGLE;
import static com.practice.designpatterns.structural.flyweight.ShapeType.SQUARE;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static final Map<ShapeType, Shape> map = new HashMap<>();

	static Shape createShape(ShapeType shapeType) {
		Shape shape;
		switch(shapeType) {
			case CIRCLE:
				shape = map.get(CIRCLE);
				if (shape == null) {
					shape = new Circle();
					map.put(shapeType, shape);
				}
				break;
			case SQUARE:
				shape = map.get(SQUARE);
				if (shape == null) {
					shape = new Square();
					map.put(shapeType, shape);
				}
				break;
			case RECTANGLE:
				shape = map.get(RECTANGLE);
				if (shape == null) {
					shape = new Rectangle();
					map.put(shapeType, shape);
				}
				break;
		}
		return map.get(shapeType);
	}
}

