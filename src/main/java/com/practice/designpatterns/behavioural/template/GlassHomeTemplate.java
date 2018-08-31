package com.practice.designpatterns.behavioural.template;

public class GlassHomeTemplate extends AbstractHomeTemplate {
	@Override
	public void constructWalls() {
		System.out.println("Constructing Glass walls");
	}

	@Override
	public void constructRoofing() {
		System.out.println("Constructing Glass Roofing");
	}
}
