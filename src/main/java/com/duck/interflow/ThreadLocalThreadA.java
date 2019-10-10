package com.duck.interflow;

import org.apache.log4j.Logger;

public class ThreadLocalThreadA extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadLocalThreadA.class);
	
	@Override
	public void run() {
		try {
			Tools.threadLocal.set("thread A");
			Thread.sleep(200);
			logger.debug(Tools.threadLocal.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
