package com.duck.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	private static Logger logger = Logger.getLogger(MyService.class);
	
	public void testMethod() {
		lock.lock();
		for (int i = 0; i < 10; i++) {
			logger.debug(i);
		}
		lock.unlock();
	}
}
