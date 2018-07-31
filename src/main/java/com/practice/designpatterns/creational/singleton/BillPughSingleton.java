package com.practice.designpatterns.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("inside BillPughSingleton()");
	}

	private static class SingletonHelper {
		static {
			System.out.println("Inside SingletonHelper () ");
		}
		private static BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
