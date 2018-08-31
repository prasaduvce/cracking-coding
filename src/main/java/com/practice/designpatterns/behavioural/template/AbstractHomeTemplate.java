package com.practice.designpatterns.behavioural.template;

public abstract class AbstractHomeTemplate {

	public void layFoundation() {
		System.out.println("Foundation laid.. ");
	}

	public abstract void constructWalls();

	public abstract void constructRoofing();

}
