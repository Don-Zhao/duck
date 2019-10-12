package com.duck.exception;

public class NotCatchExceptionMain {

	public static void main(String[] args) {
		ExceptionThread thread = new ExceptionThread();
		thread.start();
	}

}
