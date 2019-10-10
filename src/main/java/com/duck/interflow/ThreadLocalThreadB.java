package com.duck.interflow;

import org.apache.log4j.Logger;

public class ThreadLocalThreadB extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadLocalThreadB.class);
	
	@Override
	public void run() {
		try {
			Tools.threadLocal.set("thread B");
			Thread.sleep(200);
			logger.debug(Tools.threadLocal.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
