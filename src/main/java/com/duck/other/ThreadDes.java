package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadDes extends Thread {
	private Object lock;
	
	private String showChar;
	
	private int showNumPosition;
	
	private int printCount = 0;
	
	volatile private static int addNumber = 1;
	
	private static Logger logger = Logger.getLogger(ThreadDes.class);
	
	public ThreadDes(Object lock, String showChar, int showNumPosition) {
		super();
		this.lock = lock;
		this.showChar = showChar;
		this.showNumPosition = showNumPosition;
	}
	
	public void run() {
		try {
			synchronized (lock) {
				while (true) {
					if (addNumber % 3 == showNumPosition) {
						logger.debug(Thread.currentThread().getName() + " runCount=" + addNumber + " " + showChar);
						lock.notifyAll();
						addNumber++;
						printCount++;
						if (printCount == 3) {
							break;
						}
					} else {
						lock.wait();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
