package com.duck.exception;

import java.lang.Thread.UncaughtExceptionHandler;

import org.apache.log4j.Logger;

public class MyDefaultUncaughtExceptionHandler implements UncaughtExceptionHandler {

	private static Logger logger = Logger.getLogger(MyDefaultUncaughtExceptionHandler.class);
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		
		logger.debug("MyDefaultUncaughtExceptionHandler : " + e.getMessage());
	}

}
