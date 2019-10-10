package com.duck.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

public class ConditionService {
	
	private Logger logger = Logger.getLogger(ConditionService.class);
	
	private Lock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			this.lock.lock();
			logger.debug("await time : " + System.currentTimeMillis());
			this.condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			this.lock.unlock();
		}
	}
	
	public void signal() {
		try {
			this.lock.lock();
			logger.debug("signal time : " + System.currentTimeMillis());
			this.condition.signal();
		} finally {
			this.lock.unlock();
		}
	}
}
