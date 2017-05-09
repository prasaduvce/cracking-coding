package com.practice.threads.thread1.demo2;

class Runner implements Runnable {

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
		for (int i=0;i<10;i++) {
			System.out.println("Hello "+i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runner());
		thread.start();

		Thread thread1 = new Thread(new Runner());
		thread1.start();
	}
}
