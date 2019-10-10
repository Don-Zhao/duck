package com.duck.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.log4j.Logger;

public class TwoWriteLockService {
	
	private static Logger logger = Logger.getLogger(TwoWriteLockService.class);
	
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void write() {
		try {
			try {
				this.lock.writeLock().lock();
				logger.debug("get lock : " + System.currentTimeMillis());
				Thread.sleep(1000);
			} finally {
				this.lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
