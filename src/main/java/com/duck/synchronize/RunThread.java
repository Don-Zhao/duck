package com.duck.synchronize;

import org.apache.log4j.Logger;

public class RunThread extends Thread {
	
	private volatile boolean flag = true;
	
	private static Logger logger = Logger.getLogger(RunThread.class);

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		logger.debug("进入run方法");
		while (flag) {
			
		}
		
		logger.debug("退出run方法");
	}
}
