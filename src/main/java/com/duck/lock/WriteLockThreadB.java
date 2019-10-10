package com.duck.lock;

public class WriteLockThreadB extends Thread {
	
	private TwoWriteLockService service = new TwoWriteLockService();
	
	public WriteLockThreadB(TwoWriteLockService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.write();
	}
}
