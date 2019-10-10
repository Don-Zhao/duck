package com.duck.interflow;

import java.util.List;

import org.apache.log4j.Logger;

public class Producer extends Thread {
	
	public static Logger logger = Logger.getLogger(Producer.class);
	
	private List<String> list;
	
	private Object lock;
	
	public Producer(List<String> list, Object lock) {
		this.list = list;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				while (true) {
					while (this.list.size() == 1) {
						lock.wait();
						logger.debug("producer waiting...");
					}
					
					String a = new String("");
					this.list.add(a);
					this.lock.notifyAll();
					logger.debug(a + "add to list");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
