package com.duck.synchronize;

public class TwoObjectTwoLockMain {

	public static void main(String[] args) {
		HasSelfPrivateNum privateNum1 = new HasSelfPrivateNum();
		HasSelfPrivateNum privateNum2 = new HasSelfPrivateNum();
		
		SelfPrivateNumThreadA threadA = new SelfPrivateNumThreadA(privateNum1);
		SelfPrivateNumThreadB threadB = new SelfPrivateNumThreadB(privateNum2);
		threadA.start();
		threadB.start();
	}
}
