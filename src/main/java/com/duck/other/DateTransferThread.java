package com.duck.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateTransferThread extends Thread {

	private static Logger logger = Logger.getLogger(DateTransferThread.class);
	
	private SimpleDateFormat simpleDateFormat;
	
	private String date;
	
	public DateTransferThread(SimpleDateFormat simpleDateFormat, String date) {
		super();
		this.simpleDateFormat = simpleDateFormat;
		this.date = date;
	}
	
	public void run() {
		try {
			Date transferDate = this.simpleDateFormat.parse(this.date);
			String checkDate = this.simpleDateFormat.format(transferDate);
			
			if (!this.date.equals(checkDate)) {
				logger.debug("transfer error : " + this.date + " transfer to " + checkDate);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
