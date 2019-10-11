package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadH extends Thread {

	private static Logger logger = Logger.getLogger(ThreadH.class);
	
	public ThreadH(ThreadGroup group, String name) {
		super(group, name);
	}
	
	public void run() {
		logger.debug(Thread.currentThread().getName() + " is running");
		
		while (!this.isInterrupted()) {
			
		}
		
		logger.debug(Thread.currentThread().getName() + " is end");
	}
}
