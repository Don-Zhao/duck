package com.duck.synchronize;

public class SelfPrivateNumThreadMain {
	
	public static void main(String[] args) {
		HasSelfPrivateNum privateNum = new HasSelfPrivateNum();
		SelfPrivateNumThreadA threadA = new SelfPrivateNumThreadA(privateNum);
		threadA.start();
		SelfPrivateNumThreadB threadB = new SelfPrivateNumThreadB(privateNum);
		threadB.start();
	}
}
