package com.duck.exception;

public class MultiHandlerMain {

	public static void main(String[] args) {
//		ExceptionThread thread = new ExceptionThread();
////		thread.setUncaughtExceptionHandler(new MyUncaughExceptionHandler());
//		ExceptionThread.setDefaultUncaughtExceptionHandler(new MyDefaultUncaughtExceptionHandler());
//		thread.start();
		
		MyThreadGroup group = new MyThreadGroup("MyThread");
		InAllGroupThread thread = new InAllGroupThread(group, "AA", "f");
//		thread.setUncaughtExceptionHandler(new MyUncaughExceptionHandler());
		InAllGroupThread.setDefaultUncaughtExceptionHandler(new MyDefaultUncaughtExceptionHandler());
		thread.start();
	}

}
