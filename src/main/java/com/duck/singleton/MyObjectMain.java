package com.duck.singleton;

public class MyObjectMain {

	public static void main(String[] args) throws InterruptedException {
		MyObjectThread threadA = new MyObjectThread();
		MyObjectThread threadB = new MyObjectThread();
		MyObjectThread threadC = new MyObjectThread();
		
		threadA.start();
		threadB.start();
		threadC.start();
		
	}

}
