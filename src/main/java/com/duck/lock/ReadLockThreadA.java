package com.duck.lock;

public class ReadLockThreadA extends Thread {
	
	private TwoReadLockService service = new TwoReadLockService();
	
	public ReadLockThreadA(TwoReadLockService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.read();
	}
}
