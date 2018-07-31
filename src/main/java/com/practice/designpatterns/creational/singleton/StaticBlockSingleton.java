package com.practice.designpatterns.creational.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton staticBlockSingleton;

	static {
		try {
			staticBlockSingleton = new StaticBlockSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockSingleton getInstance() {
		return staticBlockSingleton;
	}
}
