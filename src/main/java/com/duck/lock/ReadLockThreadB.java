package com.duck.lock;

public class ReadLockThreadB extends Thread {
	
	private TwoReadLockService service = new TwoReadLockService();
	
	public ReadLockThreadB(TwoReadLockService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.read();
	}
}
