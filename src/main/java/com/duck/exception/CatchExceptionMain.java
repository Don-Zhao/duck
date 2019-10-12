package com.duck.exception;

public class CatchExceptionMain {

	public static void main(String[] args) {
		ExceptionThread.setDefaultUncaughtExceptionHandler(new MyUncaughExceptionHandler());
		ExceptionThread thread = new ExceptionThread();
//		thread.setUncaughtExceptionHandler(new MyUncaughExceptionHandler());
		thread.start();
	}

}
