package com.duck.exception;

import org.apache.log4j.Logger;

public class InGroupThread extends Thread {
	
	private static Logger logger = Logger.getLogger(InGroupThread.class);
	
	private String num;
	
	public InGroupThread(ThreadGroup group, String name, String num) {
		super(group, name);
		this.num = num;
	}
	
	public void run() {
		int numInt = Integer.parseInt(num);
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.debug("entry to loop");
		}
	}
}
