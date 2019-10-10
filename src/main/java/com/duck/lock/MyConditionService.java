package com.duck.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

public class MyConditionService {
	
	private static Logger logger = Logger.getLogger(MyConditionService.class);
	
	private Lock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			this.lock.lock();
			logger.debug("AAAA");
			condition.await();
			logger.debug("BBBB");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			this.lock.unlock();
			logger.debug("锁释放了");
		}
	}
}
