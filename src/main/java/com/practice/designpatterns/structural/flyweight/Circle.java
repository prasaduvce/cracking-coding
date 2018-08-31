package com.practice.designpatterns.structural.flyweight;

public class Circle implements Shape {

	void Circle() throws InterruptedException {
		Thread.sleep(1000);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle ===> ");
	}
}
