package com.duck.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

public class SingleThreadPoolMain {

	private static Logger logger = Logger.getLogger(SingleThreadPoolMain.class);
	
	public static void main(String[] args) {
		ExecutorService singlePool = Executors.newSingleThreadExecutor();
		
		singlePool.execute(new Runnable() {
			@Override
			public void run() {
				logger.debug("first task added...");
				
				logger.debug("first task compeleted...");
			}
			
		});
		
		singlePool.execute(new Runnable() {
			@Override
			public void run() {
				logger.debug("second task added...");
				
				logger.debug("second task compeleted...");
			}
			
		});
		
		singlePool.shutdown();
	}

}
