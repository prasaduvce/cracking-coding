package com.practice.designpatterns.structural.adpater;

public class AdpaterPatternTest {
	public static void main(String[] args) {
		SocketAdapter socketAdapter = new SocketAdapterImpl();
		SocketAdapterClassImpl socketClassAdapter = new SocketAdapterClassImpl();

		System.out.println("socketAdapter.get3Volt() ===> "+socketAdapter.get3Volt());
		System.out.println("socketAdapter.get12Volt() ===> "+socketAdapter.get12Volt());
		System.out.println("socketAdapter.get120Volt() ===> "+socketAdapter.get120Volt());

		System.out.println("socketClassAdapter.get3Volt() ===> "+socketClassAdapter.get3Volt());
		System.out.println("socketClassAdapter.get12Volt() ===> "+socketClassAdapter.get12Volt());
		System.out.println("socketClassAdapter.get120Volt() ===> "+socketClassAdapter.get120Volt());
	}
}
