package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadThree extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadThree.class);

	@Override
	public void run() {
		logger.debug("thread three priority:" + this.getPriority());
	}
}
