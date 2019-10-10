package com.duck.synchronize;

public class SelfPrivateNumThreadD extends Thread {
	
	private HasSelfPrivateNum privateNum;
	
	public SelfPrivateNumThreadD(HasSelfPrivateNum privateNum) {
		this.privateNum = privateNum;
	}
	
	@Override
	public void run() {
		this.privateNum.not();
	}
}
