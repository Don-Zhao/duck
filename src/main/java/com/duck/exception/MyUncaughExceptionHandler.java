package com.duck.exception;

import java.lang.Thread.UncaughtExceptionHandler;

import org.apache.log4j.Logger;

public class MyUncaughExceptionHandler implements UncaughtExceptionHandler {

	private static Logger logger = Logger.getLogger(MyUncaughExceptionHandler.class);
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		logger.debug("MyUncaughExceptionHandler出现了异常 : " + e.getMessage());
	}

}
