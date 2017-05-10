package com.practice.threads.thread13;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class App {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();

		/*executorService.submit(new Runnable() {
			@Override
			public void run() {
				int duration = new Random().nextInt(4000);
				System.out.println("Starting ....");

				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Finished ....");
			}
		});*/

		Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {

			@Override
			public Integer call() {
				int duration = new Random().nextInt(4000);
				System.out.println("Starting ....");

				if (duration > 2000) {
					throw new RuntimeException("Exception caught while executing the thread ");
				}
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Finished ....");
				return duration;
			}
		});

		executorService.shutdown();

		executorService.awaitTermination(1, TimeUnit.DAYS);
		try {
			System.out.println("Result is :"+ integerFuture.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("Caught ExecutionException : exception message is "+e.getMessage());
		}
	}
}
