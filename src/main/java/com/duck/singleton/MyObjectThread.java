package com.duck.singleton;

import org.apache.log4j.Logger;

public class MyObjectThread extends Thread {
	
	private static Logger logger = Logger.getLogger(MyObjectThread.class);
	
	@Override
	public void run() {
		logger.debug(MyObject.OBJECT.getInstance().hashCode());
	}
}
