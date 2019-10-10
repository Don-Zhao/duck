package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadOne implements Runnable {

	private static Logger logger = Logger.getLogger(ThreadOne.class);
	
	private int i = 0;
	
	@Override
	public void run() {
		try {
			while(true) {
				i++;
				logger.debug("i=" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
