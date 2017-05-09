package com.practice.threads.thread2;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;
	/**
	 * If this thread was constructed using a separate
	 * <code>Runnable</code> run object, then that
	 * <code>Runnable</code> object's <code>run</code> method is called;
	 * otherwise, this method does nothing and returns.
	 * <p>
	 * Subclasses of <code>Thread</code> should override this method.
	 *
	 * @see #start()
	 * @see #stop()
	 * @see #Thread(ThreadGroup, Runnable, String)
	 */
	@Override
	public void run() {
		while (running) {
			System.out.println("Hello");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
	}

}

public class App {
	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();

		System.out.println("Press RETURN to stop");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

		proc1.shutdown();
	}
}
