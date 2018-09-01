package com.practice.designpatterns.behavioural.mediator;

public class UserImpl extends User {

	public UserImpl (ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println("User : "+name+" Sending message "+message);
		chatMediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message, String userName) {
		System.out.println("User :"+userName+", Received message "+message);
	}
}
