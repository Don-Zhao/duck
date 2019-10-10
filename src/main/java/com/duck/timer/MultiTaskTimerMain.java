package com.duck.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import org.apache.log4j.Logger;

public class MultiTaskTimerMain {

	private static Logger logger = Logger.getLogger(MultiTaskTimerMain.class);
	
	private static Timer timer = new Timer();
	
	public static void main(String[] args) throws ParseException {
		MyTask task1 = new MyTask();
		MyTask task2 = new MyTask();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr1 = "2019-10-09 22:21:00";
		String dateStr2 = "2019-10-09 22:21:01";
		Date date1 = format.parse(dateStr1);
		Date date2 = format.parse(dateStr2);
		logger.debug("str time:" + date1.toLocaleString() + "**now time:" + new Date().toLocaleString());
		logger.debug("str time:" + date2.toLocaleString() + "**now time:" + new Date().toLocaleString());
		timer.schedule(task1, date1);
		timer.schedule(task2, date2);
	}

}
