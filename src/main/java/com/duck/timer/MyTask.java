package com.duck.timer;

import java.util.Date;
import java.util.TimerTask;

import org.apache.log4j.Logger;

public class MyTask extends TimerTask {

	private static Logger logger = Logger.getLogger(MyTask.class);
	
	@Override
	public void run() {
		logger.debug("run time : " + new Date().toLocaleString());
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
