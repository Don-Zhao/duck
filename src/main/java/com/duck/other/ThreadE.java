package com.duck.other;

public class ThreadE extends Thread {
	
	public void run() {
		try {
			synchronized (MyLock.lock) {
				MyLock.lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
