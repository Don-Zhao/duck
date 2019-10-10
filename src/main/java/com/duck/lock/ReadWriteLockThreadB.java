package com.duck.lock;

public class ReadWriteLockThreadB extends Thread {
	
	private ReadWriteLockService service;
	
	public ReadWriteLockThreadB(ReadWriteLockService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.write();
	}
}
