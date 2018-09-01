package com.practice.designpatterns.behavioural.mediator;

public class MediatorPatternTest {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediatorImpl();
		User user1 = new UserImpl(chatMediator, "User1");
		User user2 = new UserImpl(chatMediator, "User2");
		User user3 = new UserImpl(chatMediator, "User3");
		User user4 = new UserImpl(chatMediator, "User4");
		User user5 = new UserImpl(chatMediator, "User5");

		chatMediator.addUsers(user1);
		chatMediator.addUsers(user2);
		chatMediator.addUsers(user3);
		chatMediator.addUsers(user4);
		chatMediator.addUsers(user5);

		user1.send("Hello all!!!");
	}
}
