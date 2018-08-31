package com.practice.designpatterns.structural.flyweight;

import java.time.LocalDateTime;

public class FlyweightPatternTest {
	public static void main(String[] args) {
		System.out.println("Time Before first object creation ====> " + LocalDateTime.now());
		Shape shapeBefore = FlyweightFactory.createShape(ShapeType.CIRCLE);
		System.out.println("Time After first object creation ====> " + LocalDateTime.now());

		System.out.println("Time Before second object creation ====> " + LocalDateTime.now());
		Shape shapeAfter = FlyweightFactory.createShape(ShapeType.CIRCLE);
		System.out.println("Time After second object creation ====> " + LocalDateTime.now());

	}
}
