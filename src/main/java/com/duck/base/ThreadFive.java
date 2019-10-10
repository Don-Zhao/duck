package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadFive extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadFive.class);
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 5000000; i++) {
			//Thread.yield();
			count += 1;
		}
		long endTime = System.currentTimeMillis();
		logger.debug("Thread five use time:" + (endTime - startTime) + "millis.");
	}
}
