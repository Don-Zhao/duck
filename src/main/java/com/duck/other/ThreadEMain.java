package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadEMain {

	private static Logger logger = Logger.getLogger(ThreadEMain.class);
	
	public static void main(String[] args) {
		try {
			ThreadE thread = new ThreadE();
			thread.start();
			Thread.sleep(1000);
			logger.debug("in main method state:" + thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
