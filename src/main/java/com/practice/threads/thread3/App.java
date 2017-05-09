package com.practice.threads.thread3;

/**
 * Created by renuka.prasad on 5/9/2017.
 */
public class App {

	private int count;

	private synchronized void increment() {
		count++;
	}

	public static void main(String[] args) {
		App app = new App();
		app.doWork();
	}

	private void doWork() {
		Thread t1 = new Thread(() -> {
			for (int i=0;i<10000;i++) {
				increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i=0;i<10000;i++) {
				increment();
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

		System.out.println("Count : "+count);
	}
}
