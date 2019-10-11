package com.duck.other;

import org.apache.log4j.Logger;

public class AutoGroupMain {

	private static Logger logger = Logger.getLogger(AutoGroupMain.class);
	
	public static void main(String[] args) {
		logger.debug("A : " + Thread.currentThread().getName() + "parent thread group name :" + Thread.currentThread().getThreadGroup().getName() + "in this has :" + Thread.currentThread().getThreadGroup().activeGroupCount() + " thread groups");
		
		ThreadGroup group = new ThreadGroup("new group");
		
		logger.debug("B : " + Thread.currentThread().getName() + "parent thread group name :" + Thread.currentThread().getThreadGroup().getName() + "in this has :" + Thread.currentThread().getThreadGroup().activeGroupCount() + " thread groups");
		
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		
		for (ThreadGroup threadGroup : listGroup) {
			logger.debug(threadGroup.getName());
		}
		
	}

}
