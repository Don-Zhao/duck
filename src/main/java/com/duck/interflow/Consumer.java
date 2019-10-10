package com.duck.interflow;

import java.util.List;

import org.apache.log4j.Logger;

public class Consumer extends Thread {
	public static Logger logger = Logger.getLogger(Producer.class);
	
	private List<String> list;
	
	private Object lock;
	
	public Consumer(List<String> list, Object lock) {
		this.list = list;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				while (true) {
					while (this.list.size() == 0) {
						lock.wait();
						logger.debug("consumer waiting...");
					}
					
					String a = this.list.remove(0);
					this.lock.notifyAll();
					logger.debug(a + "removed from list");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
