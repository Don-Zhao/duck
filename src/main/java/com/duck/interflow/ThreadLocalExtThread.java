package com.duck.interflow;

import org.apache.log4j.Logger;

public class ThreadLocalExtThread extends Thread {

	private static Logger logger = Logger.getLogger(ThreadLocalExtThread.class);
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				logger.debug("thread A threadLocal : " + ExtTools.ext.get());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
