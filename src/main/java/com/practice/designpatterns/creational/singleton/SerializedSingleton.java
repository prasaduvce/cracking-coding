package com.practice.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private String name;

	private SerializedSingleton(String name){
		this.name = name;
	}

	private static class SerializedSingletonHelper {
		private static SerializedSingleton instance = new SerializedSingleton("testUser1");
	}

	public static SerializedSingleton getInstance() {
		return SerializedSingletonHelper.instance;
	}

	protected Object writeReplace() {
		System.out.println("Invoked writeReplace method");
		SerializedSingleton instance = getInstance();
		System.out.println("instance ==> "+instance);
		return instance;
	}

	protected Object readResolve() {
		System.out.println("Invoked read resolve method");
		return getInstance();
	}

	public String toString() {
		return "name: "+this.name;
	}
}
