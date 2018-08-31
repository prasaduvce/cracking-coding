package com.practice.designpatterns.structural.composite;

public class Circle implements Shape {
	@Override
	public void draw(String color) {
		System.out.println("Drawing circle with color : "+color);
	}
}
