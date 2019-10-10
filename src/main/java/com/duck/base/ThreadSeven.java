package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadSeven extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadSeven.class);
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					logger.debug("线程已经停止，我要退出了，不打印了");
	
					throw new InterruptedException();
				}
				logger.debug("i = " + i);
			}
		} catch (InterruptedException e) {
			logger.debug("进入ThreadSeven类的catch语句块了");
			e.printStackTrace();
		}
	}
}
