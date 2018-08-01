package com.practice.designpatterns.creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton threadSafeSingleton;

	private ThreadSafeSingleton(){}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (threadSafeSingleton == null) {
			return new ThreadSafeSingleton();
		}
		return threadSafeSingleton;
	}

	public static ThreadSafeSingleton get2LevelInstance() {
		if (threadSafeSingleton == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (threadSafeSingleton == null) {
					threadSafeSingleton = new ThreadSafeSingleton();
				}
			}
		}
		return threadSafeSingleton;
	}
}
