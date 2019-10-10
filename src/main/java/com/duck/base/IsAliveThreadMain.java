package com.duck.base;

import org.apache.log4j.Logger;

public class IsAliveThreadMain {
	
	private static Logger logger = Logger.getLogger(IsAliveThreadMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		IsAliveThread thread = new IsAliveThread();
		logger.debug("begin = " + thread.isAlive());
		thread.start();
		Thread.sleep(1000);
		logger.debug("end = " + thread.isAlive());
	}
}
