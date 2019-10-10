package com.duck.lock;

public class TwoReadLockThreadMain {

	public static void main(String[] args) {
		TwoReadLockService service = new TwoReadLockService();
		ReadLockThreadA threadA = new ReadLockThreadA(service);
		ReadLockThreadB threadB = new ReadLockThreadB(service);
		threadA.start();
		threadB.start();
	}

}
