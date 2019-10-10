package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadSix extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadSix.class);
	
	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				logger.debug("线程已经停止，我要退出了，不打印了");
				break;
			}
			logger.debug("i = " + i);
		}
	}
}
