package com.duck.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import org.apache.log4j.Logger;

public class PeriodTimerMain {

	private static Logger logger = Logger.getLogger(PeriodTimerMain.class);
	
	private static Timer timer = new Timer();
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		MyTask task = new MyTask();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = "2019-10-09 22:24:00";
		Date date = format.parse(dateStr);
		logger.debug("str time:" + date.toLocaleString() + "**now time:" + new Date().toLocaleString());
		timer.schedule(task, date, 4000);
		Thread.sleep(5000);
		task.cancel();
	}

}
