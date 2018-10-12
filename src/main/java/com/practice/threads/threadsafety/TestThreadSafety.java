package com.practice.threads.threadsafety;

public class TestThreadSafety {

	public static void main(String[] args) {
		ProcessingThread processingThread = new ProcessingThread();
		Thread thread1 = new Thread(processingThread, "thread1");
		Thread thread2 = new Thread(processingThread, "thread2");
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Total count: " + processingThread.getCount());
	}
}

class ProcessingThread implements Runnable {

	private int count;

	private final Object lock = new Object();

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			processSomething(i);

			synchronized (lock) {
				count++;
			}
		}
	}

	public int getCount() {
		return this.count;
	}

	private void processSomething(int i) {
		try {
			Thread.sleep(i + 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
