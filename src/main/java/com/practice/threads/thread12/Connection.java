package com.practice.threads.thread12;

import java.util.concurrent.Semaphore;

/**
 * Created by renuka.prasad on 5/10/2017.
 */
public class Connection {

	private final static Connection connection = new Connection();

	private int connections = 0;

	private Semaphore semaphore = new Semaphore(10);

	private Connection() {}

	public static Connection getInstance() {
		return connection;
	}

	public void connect() {

		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			connections++;
			System.out.println("Connections count ==> "+connections);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
		}

		semaphore.release();
	}
}
