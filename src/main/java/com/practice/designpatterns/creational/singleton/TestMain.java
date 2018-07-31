package com.practice.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestMain {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		System.out.println("billPughSingleton ==> "+billPughSingleton);

		BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
		System.out.println("billPughSingleton1 ==> "+billPughSingleton1);

		//Breaking Singleton pattern
		BillPughSingleton billPughSingleton2 = null;
		Constructor<?>[] declaredConstructors = BillPughSingleton.class.getDeclaredConstructors();
		for (Constructor<?> declaredConstructor : declaredConstructors) {
			declaredConstructor.setAccessible(true);
			billPughSingleton2 = (BillPughSingleton) declaredConstructor.newInstance();
			break;
		}

		System.out.println("billPughSingleton2 ==> "+billPughSingleton2);
	}
}
