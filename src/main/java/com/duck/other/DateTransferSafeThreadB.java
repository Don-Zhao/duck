package com.duck.other;

import java.text.ParseException;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateTransferSafeThreadB extends Thread {

	private static Logger logger = Logger.getLogger(DateTransferSafeThreadB.class);
	
	private String pattern;
	
	private String date;
	
	public DateTransferSafeThreadB(String pattern, String date) {
		super();
		this.pattern = pattern;
		this.date = date;
	}
	
	public void run() {
		try {
			Date transferDate = SimpleFormatDateThreadHolder.getSimpleDateFormat(this.pattern).parse(date);
			String checkDate = SimpleFormatDateThreadHolder.getSimpleDateFormat(this.pattern).format(transferDate);
			
			if (!this.date.equals(checkDate)) {
				logger.debug("transfer error : " + this.date + " transfer to " + checkDate);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
