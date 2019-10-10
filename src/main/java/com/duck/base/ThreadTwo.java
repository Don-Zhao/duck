package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadTwo extends Thread {

	private static Logger logger = Logger.getLogger(ThreadTwo.class);
	
	@Override
	public void run() {
		logger.debug("thread one prority:" + this.getPriority());
		ThreadThree thread = new ThreadThree();
		thread.start();
	}

}
