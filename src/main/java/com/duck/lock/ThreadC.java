package com.duck.lock;

import org.apache.log4j.Logger;

public class ThreadC extends Thread {
	
	private static Logger logger = Logger.getLogger(ThreadC.class);
	
	private FairOrNotService service;
	
	public ThreadC(FairOrNotService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.service();
		logger.debug("运行了");
	}
}
