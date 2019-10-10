package com.duck.interflow;

import org.apache.log4j.Logger;

public class ThreadLocalExtThreadMain {
	
	private static Logger logger = Logger.getLogger(ThreadLocalExtThreadMain.class);
	
	public static void main(String[] args) {
		logger.debug("main thread thread local: " + ExtTools.ext.get());
		ThreadLocalExtThread thread = new ThreadLocalExtThread();
		thread.start();
	}
}
