package com.duck.lock;

public class ReadWriteLockServiceMain {

	public static void main(String[] args) {
		ReadWriteLockService service = new ReadWriteLockService();
		ReadWriteLockThreadA threadA = new ReadWriteLockThreadA(service);
		ReadWriteLockThreadB threadB = new ReadWriteLockThreadB(service);
		threadA.start();
		threadB.start();
	}

}
