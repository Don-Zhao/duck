package com.duck.lock;

public class TwoConditionServiceThreadMain {

	public static void main(String[] args) throws InterruptedException {
		TwoConditionService service = new TwoConditionService();
		ThreadA threadA = new ThreadA(service);
		ThreadB threadB = new ThreadB(service);
		threadA.start();
		threadB.start();
		Thread.sleep(1000);
		service.signalB();
	}

}
