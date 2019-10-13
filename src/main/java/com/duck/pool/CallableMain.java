package com.duck.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class CallableMain {

	private static Logger logger = Logger.getLogger(CallableMain.class);
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 100, 60, TimeUnit.SECONDS, queue);
		
		Future<String> future = threadPool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				String str = "Future";
				TimeUnit.SECONDS.sleep(10);
				return str;
			}
		});
		
		String result = future.get();
		logger.debug(result);
		threadPool.shutdown();
	}
}
