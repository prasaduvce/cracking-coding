package com.practice.threads.thread8;

import java.util.Scanner;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class Processor {

	public void produce() {
		synchronized (this) {
			System.out.println("PRODUCER started ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("PRODUCER resumed");
		}
	}

	public void consume() {
		System.out.println("CONSUMER started ");

		System.out.println("Enter any key to resume producer\n");
		Scanner scanner = new Scanner(System.in);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			scanner.nextLine();
			System.out.println("Input received, now PRODUCER will be notified ");
			notify();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
