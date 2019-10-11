package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadCDMain {

	private static Logger logger = Logger.getLogger(ThreadCDMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		ThreadC threadC = new ThreadC();
		threadC.setName("a");
		threadC.start();
		
		ThreadD threadD = new ThreadD();
		threadD.setName("b");
		threadD.start();
		
		Thread.sleep(500);
		logger.debug(" main method threadD state:" + threadD.getState());
	}

}
