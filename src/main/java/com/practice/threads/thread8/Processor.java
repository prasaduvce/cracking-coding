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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);

		synchronized (this) {
			System.out.println("Enter any key to resume producer\n");
			scanner.nextLine();
			System.out.println("Input received, now PRODUCER will be notified ");
			notify();
		}
	}
}
