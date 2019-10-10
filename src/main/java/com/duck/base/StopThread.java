package com.duck.base;
import org.apache.log4j.Logger;

public class StopThread extends Thread {
	
	private static Logger logger = Logger.getLogger(StopThread.class);
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			logger.debug("i = " + i);
		}
	}
}
