package com.duck.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;

public class TwoConditionService {
	
	private static Logger logger = Logger.getLogger(TwoConditionService.class);
	
	private Lock lock = new ReentrantLock();
	
	private Condition conditionA = lock.newCondition();
	
	private Condition conditionB = lock.newCondition();
	
	public void awaitA() {
		try {
			this.lock.lock();
			logger.debug("await A time : " + System.currentTimeMillis());
			this.conditionA.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			this.lock.unlock();
		}
	}
	
	public void awaitB() {
		try {
			this.lock.lock();
			logger.debug("await B time : " + System.currentTimeMillis());
			this.conditionB.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			this.lock.unlock();
		}
	}
	
	public void signalA() {
		try {
			this.lock.lock();
			logger.debug("signal A time : " + System.currentTimeMillis());
			this.conditionA.signal();
		} finally {
			this.lock.unlock();
		}
	}
	
	public void signalB() {
		try {
			this.lock.lock();
			logger.debug("signal B time : " + System.currentTimeMillis());
			this.conditionB.signal();
		} finally {
			this.lock.unlock();
		}
	}
}
