package com.duck.interflow;

import org.apache.log4j.Logger;

public class ThreadLocalMain {
	
	private static Logger logger = Logger.getLogger(ThreadLocalMain.class);
	
	public static void main(String[] args) {
		ThreadLocalThreadA threadA = new ThreadLocalThreadA();
		ThreadLocalThreadB threadB = new ThreadLocalThreadB();
		Tools.threadLocal.set("main");
		threadA.start();
		threadB.start();
		logger.debug(Tools.threadLocal.get());
	}
}
