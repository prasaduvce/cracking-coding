package com.practice.threads.thread11;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class Account {

	private int balance = 10000;

	public void deposit(int amount) {
		this.balance = this.balance+amount;
	}

	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}

	public int getBalance() {
		return this.balance;
	}

	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}
}