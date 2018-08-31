package com.practice.designpatterns.structural.adpater;

public class SocketAdapterClassImpl extends Socket implements SocketAdapter {

	@Override
	public int get120Volt() {
		return getVolt().getVolts();
	}

	@Override
	public int get12Volt() {
		return getVolt().getVolts()/10;
	}

	@Override
	public int get3Volt() {
		return getVolt().getVolts()/40;
	}
}
