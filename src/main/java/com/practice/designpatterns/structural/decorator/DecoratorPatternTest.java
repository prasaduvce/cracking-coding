package com.practice.designpatterns.structural.decorator;

public class DecoratorPatternTest {
	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		Car luxuryCar = new LuxuryCar(new BasicCar());
		sportsCar.assemble();
		luxuryCar.assemble();

	}
}
