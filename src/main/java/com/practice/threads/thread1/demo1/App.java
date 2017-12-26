package com.practice.threads.thread1.demo1;

class Runner extends Thread {

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
		for (int i=0;i<10;i++) {
			System.out.println("Hello from "+currentThread().getName()+" with index "+i);

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
		Runner runner = new Runner();
		runner.start();

		Runner runner1 = new Runner();
		runner1.start();
	}
}
