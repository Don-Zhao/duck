package com.duck.lock;

public class MyServiceThread extends Thread {
	
	private MyService myService;
	
	public MyServiceThread(MyService myService) {
		this.myService = myService;
	}
	
	@Override
	public void run() {
		this.myService.testMethod();
	}
}
