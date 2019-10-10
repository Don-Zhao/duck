package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadSevenMain {
	
	private static Logger logger = Logger.getLogger(ThreadSevenMain.class);
	
	public static void main(String[] args) {
		
		try {
			ThreadSeven thread = new ThreadSeven();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
		} catch (InterruptedException e) {
			logger.debug("进入main方法的catch块了");
			e.printStackTrace();
		}
		
		logger.debug("end");
	}
}
