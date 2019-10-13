package com.duck.pool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class SecheduledThreadPoolMain {

	private static Logger logger = Logger.getLogger(SecheduledThreadPoolMain.class);
	
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				logger.debug(simpleDateFormat.format(new Date()));
			}
			
		};
		
		service.scheduleWithFixedDelay(runnable, 10, 5, TimeUnit.SECONDS);
	}

}
