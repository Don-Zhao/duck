package com.duck.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

public class FairOrNotService {
	
	private static Logger logger = Logger.getLogger(FairOrNotService.class);
	
	private Lock lock;
	
	public FairOrNotService(boolean fair) {
		this.lock = new ReentrantLock(fair);
	}
	
	public void service() {
		try {
			this.lock.lock();
			logger.debug("获得锁定");
		} finally {
			this.lock.unlock();
		}
	}
}
