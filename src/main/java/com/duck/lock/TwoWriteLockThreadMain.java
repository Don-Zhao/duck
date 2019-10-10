package com.duck.lock;

public class TwoWriteLockThreadMain {

	public static void main(String[] args) {
		TwoWriteLockService service = new TwoWriteLockService();
		WriteLockThreadA threadA = new WriteLockThreadA(service);
		WriteLockThreadB threadB = new WriteLockThreadB(service);
		threadA.start();
		threadB.start();
	}

}
