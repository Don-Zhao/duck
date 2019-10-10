package com.duck.lock;

public class ThreadA extends Thread {
	
	private TwoConditionService service;
	
	public ThreadA(TwoConditionService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.awaitA();
	}
}
