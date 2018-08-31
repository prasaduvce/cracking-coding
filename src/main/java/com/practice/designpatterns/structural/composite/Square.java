package com.practice.designpatterns.structural.composite;

public class Square implements Shape {
	@Override
	public void draw(String color) {
		System.out.println("Drawing square with color : "+color);
	}
}
