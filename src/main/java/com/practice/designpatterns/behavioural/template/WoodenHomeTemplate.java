package com.practice.designpatterns.behavioural.template;

public class WoodenHomeTemplate extends AbstractHomeTemplate {
	@Override
	public void constructWalls() {
		System.out.println("Constructing Wooden walls");
	}

	@Override
	public void constructRoofing() {
		System.out.println("Constructing Wooden Roofing");
	}
}
