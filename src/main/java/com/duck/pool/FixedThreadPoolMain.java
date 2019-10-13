package com.duck.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

public class FixedThreadPoolMain {
	
	private static Logger logger = Logger.getLogger(FixedThreadPoolMain.class);
	
	public static void main(String[] args) {
		ExecutorService fixedPool = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 100; i++) {
			fixedPool.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					logger.debug("Priority : " + thread.getPriority());
				}
				
			});
		}
		
		fixedPool.shutdown();
	}
}
