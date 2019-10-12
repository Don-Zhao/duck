package com.duck.other;

import java.text.ParseException;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateTransferSafeThreadA extends Thread {

	private static Logger logger = Logger.getLogger(DateTransferSafeThreadA.class);
	
	private String pattern;
	
	private String date;
	
	public DateTransferSafeThreadA(String pattern, String date) {
		super();
		this.pattern = pattern;
		this.date = date;
	}
	
	public void run() {
		try {
			Date transferDate = DateTools.parse(this.pattern, this.date);
			String checkDate = DateTools.format(this.pattern, transferDate);
			
			if (!this.date.equals(checkDate)) {
				logger.debug("transfer error : " + this.date + " transfer to " + checkDate);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
