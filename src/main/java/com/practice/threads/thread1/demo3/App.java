package com.practice.threads.thread1.demo3;

/**
 * Created by renuka.prasad on 5/9/2017.
 */
public class App {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i=0;i<10;i++) {
			System.out.println("Hello "+i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}});
		t1.start();
	}
}
