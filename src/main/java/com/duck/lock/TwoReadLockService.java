package com.duck.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.log4j.Logger;

public class TwoReadLockService {
	
	private static Logger logger = Logger.getLogger(TwoReadLockService.class);
	
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read() {
		try {
			try {
				this.lock.readLock().lock();
				logger.debug("get lock : " + System.currentTimeMillis());
				Thread.sleep(1000);
			} finally {
				this.lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
