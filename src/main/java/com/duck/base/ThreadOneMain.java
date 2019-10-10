package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadOneMain {
	
	private static Logger logger = Logger.getLogger(ThreadOneMain.class);
	
	public static void main(String[] args) {
		try {
			Thread threadOne = new Thread(new ThreadOne());
			threadOne.setDaemon(true);
			threadOne.start();
			Thread.sleep(1000);
			logger.debug("我离开thread对象也不再打印了，也算是停止了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
