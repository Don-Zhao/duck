package com.duck.interflow;

import org.apache.log4j.Logger;

public class JoinThreadMain {
	
	private static Logger logger = Logger.getLogger(JoinThreadMain.class);
	
	public static void main(String[] args) {
		try {
			JoinThreadA threadA = new JoinThreadA();
			threadA.start();
			threadA.join();
			logger.debug("我想在ThreadA执行完之后再执行，我做到了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
 