package com.duck.interflow;

import org.apache.log4j.Logger;

public class NoSychronizedWaitMain {
	
	private static Logger logger = Logger.getLogger(NoSychronizedWaitMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		logger.debug("main method start....");
		String str = new String("");
		str.wait();
		logger.debug("main method end....");
	}
}
