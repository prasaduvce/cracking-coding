package com.practice.jdk8.durga.predicates;

import java.util.function.Predicate;

public class UserAuth {

	public static void main(String[] args) {
		Predicate<User> userAuthPredicate = user -> user.getUsername().equals("durga") && user.getPassword().equals("java");
		User user1 = new User("durga", "java");
		User user2 = new User("durga1", "java1");
		System.out.println("user1 authentication >>>> ? "+userAuthPredicate.test(user1));
		System.out.println("user2 authentication >>>> ? "+userAuthPredicate.test(user2));
	}
}

class User {
	String username;
	String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
