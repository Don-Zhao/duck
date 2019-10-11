package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadB extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadB.class);
	
	public void run() {
		try {
			logger.debug("begin sleep");
			Thread.sleep(1000);
			logger.debug("end sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
