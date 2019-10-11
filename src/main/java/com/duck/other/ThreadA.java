package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadA extends Thread {

	private static Logger logger = Logger.getLogger(ThreadA.class);
	
	public ThreadA() {
		logger.debug("in constructor method : " + Thread.currentThread().getState());
	}
	
	public void run() {
		logger.debug("in run method : " + this.getState());
	}
}
