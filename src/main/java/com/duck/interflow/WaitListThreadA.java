package com.duck.interflow;

import org.apache.log4j.Logger;

public class WaitListThreadA extends Thread {

	private static Logger logger = Logger.getLogger(WaitListThreadA.class);
	
	private Object lock;
	
	private MyList list;
	
	public WaitListThreadA(MyList list, Object lock) {
		this.list = list;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				if (this.list.size() != 5) {
					logger.debug("Thread A startTime: " + System.currentTimeMillis());
					lock.wait();
					logger.debug("Thread A endTime: " + System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
