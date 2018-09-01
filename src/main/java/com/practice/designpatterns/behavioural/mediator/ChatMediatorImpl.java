package com.practice.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		this.users.forEach(user1 -> {
			if (!user1.name.equals(user.name)) {
				user1.receive(message, user1.name);
			}
		});
	}

	@Override
	public void addUsers(User user) {
		this.users.add(user);
	}


}
