package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadBMain {

	private static Logger logger = Logger.getLogger(ThreadBMain.class);
	
	public static void main(String[] args) {
		try {
			ThreadB thread = new ThreadB();
			thread.start();
			Thread.sleep(1000);
			logger.debug("main method state : " + thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
