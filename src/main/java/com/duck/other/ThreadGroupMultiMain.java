package com.duck.other;

import org.apache.log4j.Logger;

public class ThreadGroupMultiMain {

	private static Logger logger = Logger.getLogger(ThreadGroupMultiMain.class);
	
	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					logger.debug("run method");
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Thread newThread = new Thread(group, runnable);
		newThread.setName("B");
		newThread.start();
		
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		
		logger.debug("main has child thread group :" + listGroup.length + " name :" + listGroup[0].getName());
		
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		
		listGroup[0].enumerate(listThread);
		
		logger.debug(listThread.length + "==" + listThread[0].getName());
	}

}
