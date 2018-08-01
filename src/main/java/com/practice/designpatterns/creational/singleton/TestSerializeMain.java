package com.practice.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSerializeMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializedSingleton serializedSingleton = SerializedSingleton.getInstance();
		System.out.println("serializedSingleton ==> "+serializedSingleton);
		ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("serailize.ser"));
		objectOutput.writeObject(serializedSingleton);
		objectOutput.close();

		ObjectInput objectInput = new ObjectInputStream(new FileInputStream("serailize.ser"));
		SerializedSingleton deser = (SerializedSingleton) objectInput.readObject();
		objectInput.close();
		System.out.println("deser ===> "+deser);
	}
}
