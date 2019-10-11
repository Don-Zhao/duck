package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadAMain {

	private static Logger logger = Logger.getLogger(ThreadAMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA = new ThreadA();
		logger.debug("main method state 1 :" + threadA.getState());
		Thread.sleep(1000);
		threadA.start();
		Thread.sleep(1000);
		logger.debug("main method state 2 :" + threadA.getState());
	}

}
