package com.practice.threads.thread14;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting....");

		ExecutorService exec = Executors.newCachedThreadPool();

		Future<?> voidFuture = exec.submit(new Callable<Void>() {
			/**
			 * Computes a result, or throws an exception if unable to do so.
			 *
			 * @return computed result
			 *
			 * @throws Exception if unable to compute a result
			 */
			@Override
			public Void call() throws Exception {
				Random random = new Random();
				for (int i=0; i<1E8; i++) {
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("We 've been interrupted");
						break;
					}
					Math.sin(random.nextDouble());
				}
				return null;
			}
		});

		/*Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				Random random = new Random();

				for (int i=0; i<1E8; i++) {

					if (Thread.currentThread().isInterrupted()) {
						System.out.println("We 've been interrupted");
						break;
					}
					*//*try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						System.out.println("We 've been interrupted");
						break;
					}*//*
					Math.sin(random.nextDouble());
				}
			}
		});

		t.start();

		Thread.sleep(500);

		t.interrupt();

		t.join();*/

		exec.shutdown();
		Thread.sleep(500);

		//voidFuture.cancel(true);
		exec.shutdownNow();
		exec.awaitTermination(1, TimeUnit.DAYS);

		System.out.println("Fnished ... ");
	}
}
