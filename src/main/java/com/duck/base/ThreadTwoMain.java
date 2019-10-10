package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadTwoMain {
	
	private static Logger logger = Logger.getLogger(ThreadTwoMain.class);
	
	public static void main(String[] args) {
		logger.debug("main thread priority:" + Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(7);
		ThreadTwo threadTwo = new ThreadTwo();
		threadTwo.start();
		logger.debug("main thread priority:" + Thread.currentThread().getPriority());
	}
}
