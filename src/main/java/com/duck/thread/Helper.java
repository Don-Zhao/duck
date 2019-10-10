package com.duck.thread;

import org.apache.log4j.Logger;

public class Helper implements Runnable {

	private static Logger logger = Logger.getLogger(Helper.class);
	
	private String message;
	
	public Helper(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		logger.debug(this.message);
	}

}
