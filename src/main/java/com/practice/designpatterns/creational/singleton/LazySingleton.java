package com.practice.designpatterns.creational.singleton;

public class LazySingleton {

	private static LazySingleton lazySingleton;

	private LazySingleton(){}

	public static LazySingleton getInstance() {
		if (lazySingleton == null) {
			return new LazySingleton();
		}
		return lazySingleton;
	}
}
