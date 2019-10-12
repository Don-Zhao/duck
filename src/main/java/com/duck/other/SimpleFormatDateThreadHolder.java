package com.duck.other;

import java.text.SimpleDateFormat;

public class SimpleFormatDateThreadHolder {

	private static ThreadLocal<SimpleDateFormat> simpleDateFormat = new ThreadLocal<>();
	
	public static SimpleDateFormat getSimpleDateFormat(String pattern) {
		if (simpleDateFormat.get() == null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			simpleDateFormat.set(sdf);
		}
		
		return simpleDateFormat.get();
	}
}
