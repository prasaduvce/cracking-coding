package com.practice.designpatterns.behavioural.mediator;

public interface ChatMediator {
	void sendMessage(String message, User user);

	void addUsers(User user);
}
