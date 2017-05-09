package com.practice.threads.thread4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by renuka.prasad on 5/9/2017.
 */
public class Worker {

	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<>();

	private List<Integer> list2 = new ArrayList<>();

	public void step1() {

		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}

	public synchronized void step2() {

		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public void process() {
		for (int i=0;i<1000;i++) {
			step1();
			step2();
		}
	}

	public void main() {
		System.out.println("Starting .... ");
		long start = System.currentTimeMillis();

		//process();

		Thread t1 = new Thread(this::process);

		Thread t2 = new Thread(this::process);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("time taken to process : "+(end-start));
		System.out.println("List1 Size : "+list1.size());
		System.out.println("List2 Size : "+list2.size());
	}
}
