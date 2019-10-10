package com.duck.synchronize;

import org.apache.log4j.Logger;

public class HasSelfPrivateNum {
	
	private static Logger logger = Logger.getLogger(HasSelfPrivateNum.class);
	
	private int num = 0;
	
	synchronized public void add(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				logger.debug("num = " + num);
				Thread.sleep(1000);
			} else {
				num = 200;
				logger.debug("num = " + num);
			}
			
			logger.debug(username + " num = " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void not() {
		
		try {
			logger.debug("start...");
			Thread.sleep(1000);
			logger.debug("end...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
