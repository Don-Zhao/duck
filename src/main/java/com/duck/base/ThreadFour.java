package com.duck.base;

import java.util.Random;

import org.apache.log4j.Logger;

public class ThreadFour extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadFour.class);
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		int addResult = 0;
		for (int i =0; i < 10; i++) {
			for (int j = 0; j < 5000000; j++) {
				Random random = new Random();
				random.nextInt();
				addResult += j;
			}
		}
		long endTime = System.currentTimeMillis();
		logger.debug("Thread Four use time:" + (endTime - startTime));
	}
	
}
