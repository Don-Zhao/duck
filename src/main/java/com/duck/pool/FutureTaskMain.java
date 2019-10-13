package com.duck.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class FutureTaskMain {

	private static Logger logger = Logger.getLogger(FutureTaskMain.class);
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<String> future = new FutureTask<>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				String str = "FUTRUE";
				TimeUnit.SECONDS.sleep(5);
				return str;
			}
		});
		
		future.run();
		String result = future.get();
		logger.debug(result);
		
	}

}
