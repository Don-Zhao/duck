package com.duck.base;

import org.apache.log4j.Logger;

public class IsAliveThread extends Thread {
	private static Logger logger = Logger.getLogger(IsAliveThread.class);
	
	@Override
	public void run() {
		logger.debug("IsAliveThread is alive : " + this.isAlive());
	}
}
