package com.duck.interflow;

import org.apache.log4j.Logger;

public class ThreadLocalValueTest {
	
	private static Logger logger = Logger.getLogger(ThreadLocalValueTest.class);
	
	public static void main(String[] args) {
		ThreadLocal threadLocal = new ThreadLocal();
		logger.debug(threadLocal.get());
		
		MyThreadLocal myThreadLocal = new MyThreadLocal();
		logger.debug(myThreadLocal.get());
	}
}
