package com.duck.interflow;

import java.util.Random;

import org.apache.log4j.Logger;

public class JoinThreadA extends Thread {
	
	private static Logger logger = Logger.getLogger(JoinThreadA.class);
	
	@Override
	public void run() {
		try {
			int second = new Random().nextInt(10000);
			logger.debug("second: " + second);
			Thread.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
