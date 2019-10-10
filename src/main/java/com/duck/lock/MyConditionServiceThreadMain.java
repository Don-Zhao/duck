package com.duck.lock;

public class MyConditionServiceThreadMain {

	public static void main(String[] args) {
		MyConditionService service = new MyConditionService();
		MyConditionServiceThreadA thread = new MyConditionServiceThreadA(service);
		thread.start();
	}
}
