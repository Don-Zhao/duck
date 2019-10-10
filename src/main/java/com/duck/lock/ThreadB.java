package com.duck.lock;

public class ThreadB extends Thread {
	
	private TwoConditionService service;
	
	public ThreadB(TwoConditionService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.awaitB();
	}
}
