package com.duck.synchronize;

public class OneObjectTwoMethodMain {
	
	public static void main(String[] args) {
		HasSelfPrivateNum privateNum = new HasSelfPrivateNum();
		
		SelfPrivateNumThreadC threadA = new SelfPrivateNumThreadC(privateNum);
		SelfPrivateNumThreadD threadB = new SelfPrivateNumThreadD(privateNum);
		threadA.start();
		threadB.start();
	}
}
