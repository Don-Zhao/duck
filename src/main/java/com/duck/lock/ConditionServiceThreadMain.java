package com.duck.lock;

public class ConditionServiceThreadMain {

	public static void main(String[] args) throws InterruptedException {
		ConditionService service = new ConditionService();
		ConditionServiceThread thread = new ConditionServiceThread(service);
		thread.start();
		Thread.sleep(1000);
		service.signal();
	}

}
