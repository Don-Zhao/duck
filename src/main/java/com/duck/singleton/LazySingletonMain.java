package com.duck.singleton;

import org.apache.log4j.Logger;

public class LazySingletonMain {

	private static Logger logger = Logger.getLogger(LazySingletonMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		LazySingletonThread threadA = new LazySingletonThread();
		LazySingletonThread threadB = new LazySingletonThread();
		LazySingletonThread threadC = new LazySingletonThread();
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		threadA.join();
		threadB.join();
		threadC.join();
		long end = System.currentTimeMillis();
		
		logger.debug(end - start);
	}

}
