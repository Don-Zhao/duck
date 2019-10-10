package com.duck.singleton;

import org.apache.log4j.Logger;

public class StaticBlockSingletonThread extends Thread {
	
	private static Logger logger = Logger.getLogger(StaticBlockSingletonThread.class);
	
	@Override
	public void run() {
		logger.debug(StaticBlockSingleton.getInstance().hashCode());
	}
}
