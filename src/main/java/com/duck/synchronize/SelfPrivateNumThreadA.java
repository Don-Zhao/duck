package com.duck.synchronize;

public class SelfPrivateNumThreadA extends Thread {
	
	private HasSelfPrivateNum privateNum;
	
	public SelfPrivateNumThreadA(HasSelfPrivateNum privateNum) {
		this.privateNum = privateNum;
	}
	
	@Override
	public void run() {
		this.privateNum.add("a");
	}
}
