package com.duck.synchronize;

public class SelfPrivateNumThreadB extends Thread {
	
	private HasSelfPrivateNum privateNum;
	
	public SelfPrivateNumThreadB(HasSelfPrivateNum privateNum) {
		this.privateNum = privateNum;
	}
	
	@Override
	public void run() {
		this.privateNum.add("b");
	}
}
