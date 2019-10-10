package com.duck.base;

import org.apache.log4j.Logger;

public class StopThreadMain {
	
	private static Logger logger = Logger.getLogger(StopThreadMain.class);
	
	public static void main(String[] args) {
		
		try {
			StopThread thread = new StopThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			logger.debug("is stoped? : " + thread.interrupted());
			logger.debug("is stoped? : " + thread.interrupted());
			logger.debug("main thread is completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
