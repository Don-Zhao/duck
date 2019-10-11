package com.duck.other;

import org.apache.log4j.Logger;

public class GetRootThreadGroupMain {

	private static Logger logger = Logger.getLogger(GetRootThreadGroupMain.class);
	
	public static void main(String[] args) {
		logger.debug("thread : " + Thread.currentThread().getThreadGroup().getName());
		
		logger.debug("main's group' parent : " + Thread.currentThread().getThreadGroup().getParent().getName());
		
		logger.debug("main's group' parent's parent : " + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
	}

}
