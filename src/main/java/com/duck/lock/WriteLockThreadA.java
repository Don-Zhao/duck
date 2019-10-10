package com.duck.lock;

public class WriteLockThreadA extends Thread {
	
	private TwoWriteLockService service = new TwoWriteLockService();
	
	public WriteLockThreadA(TwoWriteLockService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.write();
	}
}
