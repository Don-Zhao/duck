package com.duck.other;

import java.text.SimpleDateFormat;

public class DateTransferThreadMain {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] dates = {"2019-01-01", "2019-02-01", "2019-04-05", "2019-08-05", "2019-06-01", 
							"2019-10-21", "2019-11-12", "2019-12-12"};
		
		for (int i = 0; i < dates.length; i++) {
			DateTransferThread thread = new DateTransferThread(sdf, dates[i]);
			thread.start();
		}
	}
}
