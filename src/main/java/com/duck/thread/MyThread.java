package com.duck.thread;

import org.apache.log4j.Logger;

public class MyThread {
	
	private static Logger logger = Logger.getLogger(MyThread.class);
	
	public static void main(String[] args) {
		logger.debug("main method start");
		
		Helper helper = new Helper("print this in this thread");
		Thread thread = new Thread(helper);
		thread.start();
		
		logger.debug("main method end");
	}
}
