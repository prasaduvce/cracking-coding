package com.practice.designpatterns.structural.adpater;

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
