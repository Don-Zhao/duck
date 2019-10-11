package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadHMain {

	private static Logger logger = Logger.getLogger(ThreadHMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup group = new ThreadGroup("AAAAA");
		for (int i = 0; i < 5; i++) {
			ThreadH  thread = new ThreadH(group, "thread-" + i);
			thread.start();
		}
		
		Thread.sleep(5000);
		group.interrupt();
		logger.debug("invoke interrupt method");
	}

}
