package com.duck.base;

import org.apache.log4j.Logger;

public class AnotherStopThread {
	
	public static Logger logger = Logger.getLogger(AnotherStopThread.class);
	
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
//		logger.debug("thread is " + Thread.currentThread().isInterrupted());
//		logger.debug("thread is " + Thread.currentThread().isInterrupted());
		logger.debug("thread is " + Thread.currentThread().interrupted());
		logger.debug("thread is " + Thread.currentThread().interrupted());
	}
}
