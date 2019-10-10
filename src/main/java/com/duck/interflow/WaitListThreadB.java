package com.duck.interflow;

import org.apache.log4j.Logger;

public class WaitListThreadB extends Thread {

	private static Logger logger = Logger.getLogger(WaitListThreadB.class);
	
	private Object lock;
	
	private MyList list;
	
	public WaitListThreadB(MyList list, Object lock) {
		this.list = list;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					this.list.add(i);
					if (this.list.size() == 5) {
						lock.notify();
						logger.debug("ThreadB已经发出了通知");
					}
					logger.debug("ThreadB添加了" + (i + 1) + "个元素");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
