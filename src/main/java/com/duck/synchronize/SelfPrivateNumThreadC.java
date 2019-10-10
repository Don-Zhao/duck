package com.duck.synchronize;

public class SelfPrivateNumThreadC extends Thread {
	
	private HasSelfPrivateNum privateNum;
	
	public SelfPrivateNumThreadC(HasSelfPrivateNum privateNum) {
		this.privateNum = privateNum;
	}
	
	@Override
	public void run() {
		this.privateNum.add("a");
	}
}
