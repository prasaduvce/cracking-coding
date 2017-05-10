package com.practice.threads.thread10;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class Processor {

	private int counter;

	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	public void increment() {
		for (int i=0; i<10000; i++) {
			counter++;
		}
	}

	public void thread1() throws InterruptedException {
		lock.lock();

		System.out.println("thread1 waiting .... ");
		cond.await();

		System.out.println("thread1 Woken up !!! ");
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void thread2() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();

		System.out.println("Enter input...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println("Got input ....");

		cond.signal();
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void finishThreads() {
		System.out.println("counter after threads finished ==> "+counter);
	}
}
