package com.practice.threads.thread10;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class App {


	public static void main(String[] args) {
		final Processor processor = new Processor();
		Thread t1 = new Thread(() -> {
			try {
				processor.thread1();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				processor.thread2();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		processor.finishThreads();
	}
}
