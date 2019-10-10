package com.duck.lock;

public class ReadWriteLockThreadA extends Thread {
	
	private ReadWriteLockService service;
	
	public ReadWriteLockThreadA(ReadWriteLockService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		this.service.read();
	}
}
