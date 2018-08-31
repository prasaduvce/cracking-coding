package com.practice.designpatterns.structural.adpater;

public class SocketAdapterImpl implements SocketAdapter {

	private Socket socket = new Socket();

	@Override
	public int get120Volt() {
		return this.socket.getVolt().getVolts();
	}

	@Override
	public int get12Volt() {
		return this.socket.getVolt().getVolts()/10;
	}

	@Override
	public int get3Volt() {
		return this.socket.getVolt().getVolts()/40;
	}
}
