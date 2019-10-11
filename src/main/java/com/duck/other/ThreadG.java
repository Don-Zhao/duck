package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadG extends Thread {

	private static Logger logger = Logger.getLogger(ThreadG.class);
	
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				logger.debug("thread name : " + Thread.currentThread().getName());
				
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
