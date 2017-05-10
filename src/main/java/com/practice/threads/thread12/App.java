package com.practice.threads.thread12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class App {

	public static void main(String[] args) throws InterruptedException {
		/*Thread thread = new Thread(() -> {
			for (int i=0; i< 200; i++) {
				Connection.getInstance().connect();
			}
			});
		thread.start();

		thread.join();*/

		ExecutorService executorService = Executors.newCachedThreadPool();

		for (int i=0; i<200; i++) {
			executorService.submit(() -> {Connection.getInstance().connect();});
		}

		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.DAYS);
	}
}
