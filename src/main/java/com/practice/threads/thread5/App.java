package com.practice.threads.thread5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by renuka.prasad on 5/10/2017.
 */

class Processor implements Runnable {

	private int id;

	public Processor(int id) {
		this.id = id;
	}


	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	@Override
	public void run() {
		System.out.println("STARTED : "+this.id);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("COMPLETED : "+this.id);
	}
}

public class App {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i=0; i<5; i++) {
			executorService.execute(new Processor(i));
		}

		executorService.shutdown();

		System.out.println("All tasks submitted ");

		try {
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All tasks completed ");
	}
}
