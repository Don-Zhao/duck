package com.duck.exception;

import org.apache.log4j.Logger;

public class MyThreadGroup extends ThreadGroup {
	
	private static Logger logger = Logger.getLogger(MyThreadGroup.class);
	
	public MyThreadGroup(String name) {
		super(name);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		logger.debug(t.getName() + "出现了异常");
		logger.debug("异常 : " + e.getMessage());
		this.interrupt();
	}
}
