package com.duck.singleton;

import org.apache.log4j.Logger;

public class HungrySingletonThread extends Thread {
	
	private static Logger logger = Logger.getLogger(HungrySingletonThread.class);
	
	@Override
	public void run() {
		logger.debug(HungrySingleton.getInstance().hashCode());
	}
}
