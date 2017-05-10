package com.practice.threads.thread9;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class Processor {

	private final LinkedList<Integer> list = new LinkedList<>();
	private final int LIMIT = 10;
	private final Object lock = new Object();

	public void producer() throws InterruptedException {
		int count = 0;

		while (true) {

			synchronized (lock) {
				while (list.size() == LIMIT) {
					lock.wait();
				}
				count = count + 1;
				list.add(count);
				System.out.println("Produced Item "+count);
				lock.notify();
			}
		}

	}

	public void consume() throws InterruptedException {

		Random random = new Random();

		while(true) {
			synchronized (lock) {

				while (list.size() == 0) {
					lock.wait();
				}

				System.out.print("List size : " + list.size());
				Integer item = list.removeFirst();
				System.out.println("; item consumed : " + item);
				lock.notify();
			}
			Thread.sleep(random.nextInt(1000));
		}
	}
}
