package com.duck.base;

import org.apache.log4j.Logger;

public class ThreadFourMain {
	
	private static Logger logger = Logger.getLogger(ThreadFourMain.class);
	
	public static void main(String[] args) {
		ThreadFour one = new ThreadFour();
		one.setPriority(5);
		one.setName("Thread-ONE");
		one.start();
		
		ThreadFour two = new ThreadFour();
		two.setPriority(6);
		two.setName("Thread-Two");
		two.start();
	}
}
