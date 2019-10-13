package com.duck.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

public class CachedPoolMain {

	private static Logger logger = Logger.getLogger(CachedPoolMain.class);
	
	public static void main(String[] args) {
		ExecutorService cachedPool = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 1000; i++) {
			final int index = i;
			cachedPool.execute(new Runnable() {
				@Override
				public void run() {
					logger.debug(index + "th task is completed");
				}
				
			});
		}
	}

}
