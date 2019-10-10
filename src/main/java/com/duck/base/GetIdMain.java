package com.duck.base;

import org.apache.log4j.Logger;

public class GetIdMain {
	
	private static Logger logger = Logger.getLogger(GetIdMain.class);
	
	public static void main(String[] args) {
		logger.debug("main thread id : " + Thread.currentThread().getId());
	}
}
