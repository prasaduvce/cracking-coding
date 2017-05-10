package com.practice.threads.thread8;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class App {
	public static void main(String[] args) {
		Processor processor = new Processor();

		Thread producerThread = new Thread(processor::produce);
		Thread consumerThread = new Thread(processor::consume);

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
