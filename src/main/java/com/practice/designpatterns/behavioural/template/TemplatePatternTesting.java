package com.practice.designpatterns.behavioural.template;

public class TemplatePatternTesting {
	public static void main(String[] args) {
		GlassHomeTemplate glassHomeTemplate = new GlassHomeTemplate();
		WoodenHomeTemplate woodenHomeTemplate = new WoodenHomeTemplate();

		glassHomeTemplate.layFoundation();
		glassHomeTemplate.constructWalls();
		glassHomeTemplate.constructRoofing();

		woodenHomeTemplate.layFoundation();
		woodenHomeTemplate.constructWalls();
		woodenHomeTemplate.constructRoofing();

	}
}
