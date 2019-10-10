package com.duck.lock;

public class MyConditionServiceThreadA extends Thread {
	
	private MyConditionService service;
	
	public MyConditionServiceThreadA(MyConditionService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.await();
	}
}
