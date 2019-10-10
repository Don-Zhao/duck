package com.duck.singleton;

import org.apache.log4j.Logger;

public class LazySingletonThread extends Thread {
	
	private static Logger logger = Logger.getLogger(LazySingletonThread.class);
	
	@Override
	public void run() {
		logger.debug(LazySingleton.getInstance().hashCode());
	}
}
