package com.duck.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.log4j.Logger;

public class ReadWriteLockService {
	
	private static Logger logger = Logger.getLogger(ReadWriteLockService.class);
	
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read() {
		try {
			try {
				this.lock.readLock().lock();
				logger.debug("get read lock : " + System.currentTimeMillis());
				Thread.sleep(1000);
			} finally {
				this.lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void write() {
		try {
			try {
				this.lock.writeLock().lock();
				logger.debug("get write lock : " + System.currentTimeMillis());
				Thread.sleep(1000);
			} finally {
				this.lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
