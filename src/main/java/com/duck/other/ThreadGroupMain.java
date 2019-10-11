package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadGroupMain {

	private static Logger logger = Logger.getLogger(ThreadGroupMain.class);
	
	public static void main(String[] args) {
		ThreadF f = new ThreadF();
		ThreadG g = new ThreadG();
		ThreadGroup group = new ThreadGroup("AAA");
		
		Thread a = new Thread(group, f);
		Thread b = new Thread(group, g);
		
		a.start();
		b.start();
		
		logger.debug("active threads count : " + group.activeCount());
		logger.debug("threadGroup Name : " + group.getName());
	}

}
