package com.practice.threads.thread9;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class App {

	public static void main(String[] args) {
		final Processor processor = new Processor();

		Thread producerThread = new Thread(() -> {
			try {
				processor.producer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread consumerThread = new Thread(() -> {
			try {
				processor.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		producerThread.start();
		consumerThread.start();

		try {
			producerThread.join();
			consumerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
