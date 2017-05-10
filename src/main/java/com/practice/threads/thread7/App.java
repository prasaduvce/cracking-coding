package com.practice.threads.thread7;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class App {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {
		App app = new App();


		Thread producerThread = new Thread(app::producer);
		Thread consumerThread = new Thread(() -> {
			try {
				app.consumer();
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

	private void producer() {
		Random random = new Random();
		while (true) {
			int task = random.nextInt(100);
			System.out.println("PRODUCER producing : task "+task);
			try {
				queue.put(task);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consumer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(3000);
			int task = random.nextInt(10);
			System.out.println("CONSUMER consuming : task "+task);
			if (task == 0) {
				int value = queue.take();

				System.out.println("Taken value : "+ value+" ; Queue size is: "+queue.size());
			}
		}
	}
}
