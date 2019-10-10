package com.duck.singleton;

import org.apache.log4j.Logger;

public class InnerStaticClassSingletonThread extends Thread {
	
	private static Logger logger = Logger.getLogger(InnerStaticClassSingletonThread.class);
	
	@Override
	public void run() {
		logger.debug(InnerStaticClassSingleton.getInstance().hashCode());
	}
}
