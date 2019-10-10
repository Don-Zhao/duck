package com.duck.lock;

public class ConditionServiceThread extends Thread {
	
	private ConditionService conditionService;
	
	public ConditionServiceThread(ConditionService conditionService) {
		super();
		this.conditionService = conditionService;
	}
	
	@Override
	public void run() {
		this.conditionService.await();
	}
}
