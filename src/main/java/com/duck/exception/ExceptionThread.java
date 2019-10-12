package com.duck.exception;

import org.apache.log4j.Logger;

public class ExceptionThread extends Thread {

	private static Logger logger = Logger.getLogger(ExceptionThread.class);
	
	public void run() {
		String username = null;
		logger.debug(username.hashCode());
	}
}
