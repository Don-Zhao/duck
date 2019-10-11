package com.duck.other;

import org.apache.log4j.Logger;

public class ServiceA {
	
	private static Logger logger = Logger.getLogger(ServiceA.class);
	
	public synchronized static void service() {
		try {
			logger.debug("enter to service method");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
