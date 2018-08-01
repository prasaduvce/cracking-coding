package com.practice.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private SerializedSingleton(){}

	private static class SerializedSingletonHelper {
		private static SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SerializedSingletonHelper.instance;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
